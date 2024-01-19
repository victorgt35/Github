public class Main {
    public static void main(String[] args)  {
        Thread t1=new Thread(new Tarea(),"Tarea1");
        Thread t2=new Thread(new Tarea(),"Tarea2");
        Thread t3=new Thread(new Tarea(),"Tarea3");
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();

        System.out.println("Fin del hilo main");
    }
}