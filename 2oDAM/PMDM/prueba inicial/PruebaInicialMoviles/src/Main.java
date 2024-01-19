public class Main {

    public Main(){
        ejecutar();



    }
    public void ejecutar(){
        Usuario user=new Usuario();
        user.pedirUsuario();
        user.pedirContrasenha();

    }



    public static void main(String[] args) {
        new Main();




    }
}