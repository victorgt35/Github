public class Main {
    public static void main(String[] args) {
        //Instancia el contenedor
        Contenedor contenedor = new Contenedor();
        //instancia el productor y el consumidor
        Productor productor = new Productor(contenedor);
        Consumidor consumidor = new Consumidor(contenedor);
        //Llama a los metodos run() de las clases productor y consumidor
        productor.start();
        consumidor.start();

    }
}