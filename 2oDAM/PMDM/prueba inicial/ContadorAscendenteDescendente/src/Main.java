public class Main {
    public static void main(String[] args) {
        Thread asc=new Thread(new ContadorAscendente(10));
        Thread desc=new ContadorDescendente(10);

        desc.start();
        asc.start();



    }
}