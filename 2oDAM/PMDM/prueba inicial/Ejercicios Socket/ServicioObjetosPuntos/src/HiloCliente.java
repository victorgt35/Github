import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloCliente implements Runnable {


    private int cliente;
    private Socket socket;
    private ObjectInputStream desdeCliente;
    private ObjectOutputStream haciaCliente;
    private Punto p;

    public HiloCliente(int cliente, Socket socket) {
        this.cliente = cliente;
        this.socket = socket;
        Thread th = new Thread(this);
        th.start();
    }


    @Override
    public void run() {

        try {
            desdeCliente = new ObjectInputStream(socket.getInputStream());
            int n = desdeCliente.readInt();
            System.out.println("Recibiendo del cliente " + n + " puntos");
            for (int i = 1; i <= n; i++) {
                try {
                    p = (Punto) desdeCliente.readObject();
                    System.out.println("Recibido de cliente " + cliente + " " + p.toString());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }
            socket.close();
            desdeCliente.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
