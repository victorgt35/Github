import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorPuntos {
    public final static int PUERTO = 5000;

    public final static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(PUERTO);
            System.out.println("Servidor de puntos escuchando ....");
            int cliente = 0;
            while (true) {
                cliente++;
                Socket socket = server.accept();
                System.out.println("Aceptada conexión cliente " + cliente);
                new HiloCliente(cliente, socket);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
