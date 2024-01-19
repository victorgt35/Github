import java.io.IOException;
import java.net.Socket;

public class EscaneadorPuertosTcp
{
	private String host;
	private int desde; // puerto a partir del cual se realiza el escaneo
	private int hasta; // puerto hasta el que se realiza el escaneo

	public EscaneadorPuertosTcp(String host, int desde, int hasta)
	{
		this.host = host;
		this.desde = desde;
		this.hasta = hasta;
	}

	/**
	 * Para escanear este programa cliente intenta establecer conexión (creando un Socket) con cada
	 * uno de los puertos del host destino que hay en el rango. Si la conexión se establece 
	 * es que hay algún proceso servidor escuchando, en ese caso se 
	 * muestra el mensaje "Conexión establecida en puerto XXX - Puerto abierto"
	 * Si falla el intento de conexión se indica con el mensaje
	 * "Puerto no abierto, fallo en la conexión"
	 * 
	 * Se capturarán todas las posibles excepciones
	 */
	public void escanear() 
	{
		Socket socket = new Socket();
		for (int p = desde;p<=hasta;p++){
			socket = null;


		}

		
	}

	/**
	 * 
	 */
	public static void main(String[] args)  
	{
		if (args.length != 3)
		{
			System.out
					.println("Error, Sintasis: java EscanedorPuertosTcp <host> <inicio_rango> <fin_rango>");
			return;
		}

		// aceptar los tres argumentos
		// crear un objeto EscaneadorPuertosTcp y llamar al método escanear()

	}

}
