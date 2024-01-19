public class Main {
    public static void main(String[] args) {

        Thread sum=new Suma(7);

        sum.start();


        Thread facts=new Factorial(7);

        facts.start();


    }
}