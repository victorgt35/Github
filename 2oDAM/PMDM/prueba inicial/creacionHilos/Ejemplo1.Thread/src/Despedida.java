public class Despedida extends Thread{

    private final int ITERACIONES= 10;
    @Override
    public void run() {
        for(int i=0;i<ITERACIONES;i++){
            System.out.println("Adios - Hilo: "+this.getName()+" - número: "+i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
