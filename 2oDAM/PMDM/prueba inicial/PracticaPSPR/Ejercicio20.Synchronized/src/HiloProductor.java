public class HiloProductor extends Thread{

    Buffer buffer = new Buffer();

    public HiloProductor(Buffer buffer){

    }

    @Override
    public synchronized void run() {
        for(int i=0;i<20;i++){
            buffer.insertar((int)(Math.random()*100));

        }

    }
}
