public class TareaDeposito implements Runnable {

    private double cantidad;
    private final int INGRESOS = 10;
    private static final int TIEMPO = 1000;
    private CuentaBancaria cuenta;

    public TareaDeposito(CuentaBancaria cuenta, double cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;


    }

    @Override
    public void run() {
        for (int i = 1; i <= INGRESOS; i++) {
            try {
                cuenta.depositar(cantidad);
                Thread.sleep(TIEMPO);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
