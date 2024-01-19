import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class ServidorSimple
{

	/**
	 * Cuando el servidor acepta una conexión del cliente le envía un saludo
	 */
	public static void main(String[] args) throws IOException
	{
		final int PUERTO = 4000;
		// registrar el servicio en el puerto 400
		ServerSocket servidor = new ServerSocket(PUERTO);
		System.out.println("Servidor conectado, esperando peticiones de clientes ....");
		System.out.println("Servidor escuchando en puerto local " + servidor.getLocalPort());
		Socket socket = servidor.accept(); // esperar y aceptar conexión
		System.out.println("Aceptada conexión de cliente desde IP " + socket.getInetAddress());
		System.out.println("Puerto remoto del cliente " + socket.getPort());
		// obtener flujo  de escritura asociado  al socket		 
		OutputStream os = socket.getOutputStream();
		DataOutputStream out = new DataOutputStream(os);
		// enviar saludo al cliente
		out.writeUTF("Saludo desde el servidor");
		out.flush();
		out.close();
		socket.close();
		servidor.close(); // servidor cierra la conexión
		
		
	}

}
