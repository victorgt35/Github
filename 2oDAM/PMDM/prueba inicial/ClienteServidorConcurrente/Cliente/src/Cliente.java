import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    public static void main(String [] args){
        final int PUERTO= 5000;
        final String HOST= "localhost";
        Scanner sc =new Scanner(System.in);
        try{
            Socket cliente = new Socket(HOST,PUERTO);
            PrintWriter alServidor = new PrintWriter(new BufferedWriter(new OutputStreamWriter(cliente.getOutputStream())));
            BufferedReader delServidor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            System.out.println("Introduce texto: ");
            String texto = sc.nextLine();

            alServidor.println(texto);
            alServidor.flush();

            String textoMayusculas = delServidor.readLine();
            System.out.println("Recibido del servidor: "+textoMayusculas);

            alServidor.close();
            delServidor.close();
            cliente.close();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
