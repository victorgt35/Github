public class HiloHucha implements Runnable{

    private Hucha hucha = new Hucha();
    private final int CANTIDAD = 2;
    private final int VECES= 100;

    private final int TIEMPO = 30;

    public HiloHucha(Hucha hucha){
        this.hucha = hucha;

    }


    @Override
    public synchronized void run() {
        for(int i=1;i<=VECES;i++){
            hucha.add(CANTIDAD);
            try {
                System.out.println(hucha.getTotal());
                Thread.sleep(TIEMPO);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
    }
}
