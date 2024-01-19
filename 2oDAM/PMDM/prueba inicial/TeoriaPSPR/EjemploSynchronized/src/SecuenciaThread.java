public class SecuenciaThread {
    private final int TIEMPO = 300;
    private Secuencia secuencia;

    public SecuenciaThread(Secuencia secuencia){



    }

    public void run(){
        for(int i=1;i<=10;i++)
            secuencia.getSiguiente();
        try {
            Thread.sleep(TIEMPO);
        }catch (InterruptedException e){
            throw new RuntimeException(e)
        }


    }

}
