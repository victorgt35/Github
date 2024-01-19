public class Secuencia {
    private int siguiente;
    public static void main(String[] args) {

        Secuencia secuencia = new Secuencia();

        Thread hilo1 = new SecuenciaThread(secuencia);
        Thread hilo2 = new SecuenciaThread(secuencia);

        hilo1.start();
        hilo2.start();
    }
    public Secuencia(){
        this.siguiente = 0;
    }
    public synchronized getSiguiente(){
        siguiente = siguiente + 1;
        System.out.println(Thread.currentThread().getName()+(" - "+siguiente));

    }


}
