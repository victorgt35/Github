public class Productor extends Thread{

    private Contenedor contenedor;

    public Productor(Contenedor contenedor){
        this.contenedor=contenedor;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++)
        {
            contenedor.producir(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
