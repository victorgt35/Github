import java.util.ArrayList;
import java.util.List;

public class DemoHucha {

    private static final int HILOS=100;

    public static void main(String []args){
        Hucha hucha = new Hucha();
        HiloHucha hiloHucha=new HiloHucha(hucha);

        List<Thread> lista=new ArrayList();
        for (int i=1;i<=HILOS;i++){
            lista.add(new Thread(hiloHucha));

        }

        for (int i=0;i<HILOS;i++){

            lista.get(i).start();


        }

    }





}
