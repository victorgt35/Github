import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClienteSimple
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		final int PUERTO = 4000;
		// crear socket y conectar con el servidor
		Socket cliente = new Socket("localhost", PUERTO);
		System.out.println("Conectado a servidor\nPuerto local del cliente "
				+ cliente.getLocalPort());
		System.out.println("IP del servidor "
				+ cliente.getInetAddress().toString());
		System.out.println("Puerto remoto del servidor "
				+ cliente.getPort());

		// obtener flujo de entrada y leer los datos recibidos desde el servidor
		InputStream is = cliente.getInputStream();
		DataInputStream input = new DataInputStream(is);
		String strSaludo = input.readUTF();
		System.out.println("Recibido del servidor- " + strSaludo);
		// cerra flujos y conexión
		is.close();
		input.close();
		cliente.close();

	}

}
