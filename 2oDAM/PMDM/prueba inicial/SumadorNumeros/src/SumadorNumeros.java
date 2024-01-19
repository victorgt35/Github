import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SumadorNumeros {


    public static void main(String[] args) {
        final int PUERTO = 5000;
        final String HOST = "localhost";

        try {
            ServerSocket servidor = new ServerSocket(PUERTO);
            System.out.println("Esperando una conexion... ");

            Socket socket =servidor.accept();
            System.out.println("Un cliente se ha conectado desde la IP"+socket.getInetAddress().getHostName());

            BufferedReader delCliente=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String linea=delCliente.readLine();







        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}