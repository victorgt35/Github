public class ContadorAscendente implements Runnable{

    public ContadorAscendente(int iteraciones){
        this.iteraciones=iteraciones;

    }
    private int iteraciones;


    @Override
    public void run() {

        Thread t=Thread.currentThread();
        for(int i=0;i<=iteraciones;i++){
            System.out.println("contador ascendente : "+i);
            Thread.yield();
        }

    }


}
