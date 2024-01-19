public class HiloConsumidor extends Thread{
    Buffer buffer=new Buffer();
    public HiloConsumidor(Buffer buffer) {
    }

    @Override
    public synchronized void run() {
        for (int i=0;i<20;i++){
            buffer.consumir();


        }
    }
}
