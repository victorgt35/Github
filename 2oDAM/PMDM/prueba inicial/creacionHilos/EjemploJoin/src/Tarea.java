public class Tarea implements Runnable {
    @Override
    public void run() {
        Thread hilo=Thread.currentThread();
        System.out.println("El hilo se inicia: "+hilo.getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El hilo finaliza: "+hilo.getName());

    }
}
