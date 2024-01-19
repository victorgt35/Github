import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorPalabras implements Runnable{

    private String nombreFichero;

    public ContadorPalabras(String nombreFichero){

    }

    @Override
    public void run() {
        try(Scanner entrada = new Scanner(new File(this.nombreFichero))){
            int contador=0;
            while (entrada.hasNextLine()){
                String linea=entrada.nextLine();
                linea=linea.replaceAll("\\s+"," ");
                String palabras[] = linea.split(" ");
                contador +=palabras.length;

            }

            System.out.println(this.nombreFichero.split("/")[1]+"palabras:"+contador);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
