public class Main {
    public static void main(String[] args) {

        Thread hiloSaludo=new Thread(new Saludo());
        hiloSaludo.start();
        Thread hiloDespedida=new Thread(new Despedida());
        hiloDespedida.start();
    }
}