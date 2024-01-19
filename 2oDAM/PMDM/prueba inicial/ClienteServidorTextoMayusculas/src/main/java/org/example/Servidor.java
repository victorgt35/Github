package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {


    public static void main(String [] args){
        final int PUERTO = 5000;

        try{
            ServerSocket servidor = new ServerSocket(PUERTO);
            System.out.println("Esperando una conexion...");

            Socket socket = servidor.accept();
            System.out.println("Un cliente se ha conectado desde la IP "+socket.getInetAddress().getHostName());

            PrintWriter alCliente = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            BufferedReader delCliente = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String linea = delCliente.readLine();
            alCliente.println("Desde el servidor: "+linea.toUpperCase());
            alCliente.flush();

            alCliente.close();
            delCliente.close();
            socket.close();
            servidor.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
