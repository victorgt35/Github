public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread hilo1=Thread.currentThread();
                int par=2;
                for(int i=0;i<10;i++){

                    System.out.print(hilo1.getName());
                    System.out.print(" - Par: "+par);
                    System.out.println();
                    par=par+2;

                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            Utility u=new Utility();
            @Override
            public void run() {
                Thread hilo2=Thread.currentThread();
                for(int i=0;i<10;i++){
                    if(u.esPrimo(i)){
                        System.out.print(hilo2.getName());
                        System.out.print(" - Primo: "+i);
                        System.out.println();
                    }

                }




            }
        });


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fin del hilo main");



    }
}