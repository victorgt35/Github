public class Suma extends Thread{
    public Suma(int n){
        this.n=n;


    }
    private int n;

    @Override
    public void run() {
        int aux=n;

        for(int i=0;i<n;i++){
            aux=i+aux;

        }
            System.out.println("suma de los "+n+" primeros numeros: "+aux);



    }
}
