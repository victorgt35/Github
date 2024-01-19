public class EjemploHiloAnonima {


    public static void main(String[] args) {
        Thread segundoHilo=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Started running - "+Thread.currentThread().getName());

                System.out.println();
                System.out.println("Propiedades del segundo hilo: ");
                System.out.println();
                Thread silk=Thread.currentThread();
                System.out.println("Nombre "+silk.getName());
                System.out.println("Prioridad: "+silk.getPriority());
                System.out.println("ID: "+silk.getId());
                System.out.println("Estado: "+silk.getState());
                System.out.println("Vivo?: "+silk.isAlive());
                System.out.println("En segundo plano?: "+silk.isDaemon());
                System.out.println("Fin de run alcanzado en segundo hilo.");
            }
        });
        segundoHilo.start();
    }

}