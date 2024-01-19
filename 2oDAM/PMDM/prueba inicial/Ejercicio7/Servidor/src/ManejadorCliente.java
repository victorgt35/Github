import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ManejadorCliente implements Runnable{

    private int numCliente;
    private Socket socket;

    public ManejadorCliente(int numCliente, Socket socket) {
        this.numCliente = numCliente;
        this.socket=socket;
        Thread hilo = new Thread(this);
        hilo.start();
    }


    @Override
    public void run() {
        System.out.println("Conexión establecida con cliente "+this.numCliente);
        System.out.println("Cliente en IP "+socket.getInetAddress().toString());

        //Obtener los flujos de salida y entrada
        try {
            PrintWriter alCliente = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            Scanner delCliente = new Scanner(socket.getInputStream());

            //Leemos la linea recibida del cliente y se la entregamos convertida a mayúsculas
            String linea = delCliente.nextLine();

            ArrayList<String> listaCliente=new ArrayList<>();

            listaCliente.add(linea);

            //Cerrar los recursos

            alCliente.close();
            delCliente.close();
            socket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
