import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hilo implements Runnable,Comparable {
    int longitudArray=1000;
    int[] numeros =new int[longitudArray];

    public void generarNumeros() {
        double r=0;
        for(int i=0;i<numeros.length;i++){
            r= Math.floor(Math.random()*1000);

            numeros[i]=(int)r;

        }

    }

    @Override
    public void run() {
        StringBuilder numeroDerecho=new StringBuilder();
        StringBuilder numeroInverso;

        for(int i=0;i<numeros.length;i++){
            if(i!=0) {
                numeroDerecho.delete(i - 1, i);
            }
            numeroDerecho=numeroDerecho.append(numeros[i]);
            numeroInverso=numeroDerecho.reverse();
            if(((numeroDerecho.toString()).equals(numeroInverso.toString()))){
                System.out.println("El número: "+numeros[i]+" Es capicúa");


            }

        }

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
