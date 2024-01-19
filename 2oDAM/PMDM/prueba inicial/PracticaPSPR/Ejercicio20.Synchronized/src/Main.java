public class Main {
    public static void main(String[] args) {
        Buffer buffer=new Buffer();

        HiloProductor hiloProductor=new HiloProductor(buffer);
        HiloConsumidor hiloConsumidor=new HiloConsumidor(buffer);

        hiloProductor.start();
        hiloConsumidor.start();

    }
}