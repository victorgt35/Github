public class Main {
    public static void main(String[] args) {
        for(String filename:args){
            Thread th=new Thread(new ContadorPalabras("Fichero1.txt"));


        }



    }
}
