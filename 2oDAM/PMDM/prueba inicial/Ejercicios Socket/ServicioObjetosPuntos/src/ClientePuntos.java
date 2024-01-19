import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientePuntos {
    private static int y;

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Uso: java ClientePuntos <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        Socket s = new Socket("localhost", 5000);
        System.out.println("Cliente conectado a servidor en puerto " + s.getPort());
        ObjectOutputStream haciaServidor = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream desdeServidor = new ObjectInputStream(s.getInputStream());
        haciaServidor.writeInt(n);
        haciaServidor.flush();
        System.out.println("Enviando" + n + " puntos ....");
        for (int i = 1; i <= n; i++) {

            int x = (int) (Math.random() * 11) + 10;
            int y = (int) (Math.random() * 11) + 10;
            Punto p = new Punto(x, y);
            System.out.println(p.toString());
            haciaServidor.writeObject(p);
            haciaServidor.flush();

        }

    }
}