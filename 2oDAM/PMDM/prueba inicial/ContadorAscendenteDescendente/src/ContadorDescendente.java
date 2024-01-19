public class ContadorDescendente extends Thread{
    public ContadorDescendente(int iteraciones){
        this.iteraciones=iteraciones;
    }
    private int iteraciones;
    @Override
    public void run() {
        for(int i=iteraciones;i>=0;i--){
            System.out.println("contador descendente: "+i);

            Thread.yield();
        }
    }
}


