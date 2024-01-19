public class CuentaBancaria {
    private double balance;
    public CuentaBancaria(){

        balance=0;


    }
    public synchronized void depositar(double cantidad){
        System.out.println("Depositando "+cantidad);
        double nuevoBalance = balance + cantidad;
        System.out.println(", nuevo balance es " + nuevoBalance);
        balance=nuevoBalance;

    }

    public synchronized double getBalance(){

        return balance;

    }



}
