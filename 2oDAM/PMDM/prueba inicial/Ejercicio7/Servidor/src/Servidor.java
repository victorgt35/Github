import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {

        final int PUERTO =5000;
        int numCliente = 0;

        ServerSocket servidor = null;
        try{
            servidor = new ServerSocket((PUERTO));
            System.out.println("Servidor concurrente conectado en el puerto "+servidor.getLocalPort());

            while (true){
                numCliente++;
                Socket socket = servidor.accept();

                //Creamos un manejador para las peticiones de cada cliente
                new ManejadorCliente (numCliente, socket);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);


        }finally{
            try {
                servidor.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}