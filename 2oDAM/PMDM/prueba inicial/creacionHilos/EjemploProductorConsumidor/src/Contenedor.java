public class Contenedor {

    private int contenido;
    private boolean disponible;

    public synchronized void producir(int valor) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        contenido = valor;
        System.out.println("Produciendo: " + this.contenido);

        disponible = true;
        notifyAll();


    }

    public synchronized int consumir() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumiendo: " + this.contenido);
        disponible = false;
        notifyAll();
        return contenido;

    }


}
