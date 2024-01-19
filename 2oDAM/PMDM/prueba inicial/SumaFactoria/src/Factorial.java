public class Factorial extends Thread{

    public Factorial(int n){

        this.n=n;

    }


    private int n;
    @Override
    public void run() {
        int aux=1;
        for(int i=1;i<=n;i++){
            aux=aux*i;

        }
            System.out.println("Factorial de "+n+": "+aux);



    }
}
