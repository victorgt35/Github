public class Despedida implements Runnable {

    private final int ITERACIONES= 10;
    @Override
    public void run() {
        Thread t=null;

        for(int i=0;i<ITERACIONES;i++){
            t=Thread.currentThread();
            System.out.println("Adios - Hilo: "+t.getName()+" - número: "+i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

