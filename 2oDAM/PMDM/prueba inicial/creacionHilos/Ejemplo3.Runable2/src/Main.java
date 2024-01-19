public class Main {
    public static void main(String[] args) {
        Saludo saludo=new Saludo();
        Thread hiloDespedida=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread t=Thread.currentThread();
                for(int i=0;i<10;i++){
                    System.out.println("Adios - Hilo: "+t.getName()+" - número: "+i);
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        hiloDespedida.start();
    }
}