import java.util.ArrayList;
import java.util.List;

public class Buffer {

    private final int TAMANHO=10;

    List<Integer> productos;

    public Buffer(){
        productos=new ArrayList<Integer>();

    }

    public synchronized void insertar(int valor){
        while(productos.size()==TAMANHO){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        productos.add(valor);
        System.out.println("Añadido producto: "+valor);
        notifyAll();
    }
    public synchronized void consumir(){

        while(productos.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        productos.remove(0);
        System.out.println("Consumido producto: "+productos.get(0));

        notifyAll();

    }





}
