import java.util.Random;

public class Utilidad {

    public static String dniAleatorio(){
        Random r=new Random();
        int nA=r.nextInt(10);
        String dni=nA+nA+nA+nA+nA+nA+nA+nA+"A";


        return dni;
    }

    public static int edadAleatoria(){
        Random r=new Random();
        int nA=r.nextInt(100);
        return nA;

    }

}
