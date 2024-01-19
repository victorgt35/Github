public class Main {
    public static void main(String[] args) {
        Hilo hilo1=new Hilo();
        hilo1.generarNumeros();
        Thread t1=new Thread(hilo1);

        t1.start();


    }
}