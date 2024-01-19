public class Main {
    public static void main(String[] args) {

        Thread hiloSaludo = new Saludo();
        hiloSaludo.start();

        Thread hiloDespedida = new Despedida();
        hiloDespedida.start();


    }
}