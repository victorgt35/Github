public class TestCuenta {

    public static void main(String[]args){
        CuentaBancaria cuenta =new CuentaBancaria();
        TareaDeposito tarea = new TareaDeposito(cuenta,100);
        Thread t1 = new Thread(tarea);
        Thread t2 = new Thread(tarea);
        t1.start();
        t2.start();

    }

}
