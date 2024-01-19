import java.sql.Array;
import java.util.*;

public class Usuario {

    Scanner sc;

    public Usuario() {
        sc = new Scanner(System.in);
    }

    private String userName;
    private String contrasenha;

    String[] usuarios = {"Manuel","Javier","Cesar"};


    public String pedirUsuario() {
        System.out.println("Introduce tu usuario, tienes 3 intentos");
        String usuario;
        int identificador;
        int contadorIntentos=3;
        usuario = sc.nextLine();
        for (int i = 0; i < usuarios.length; i++) {
            if (usuario.equals(usuarios[i])){
                usuario = usuarios[i];
                System.out.println("Bienvenido "+usuarios[i]);
            }
            else{
                System.out.println("Usuario no encontrado");
                contadorIntentos=contadorIntentos-1;
                System.out.println("Te quedan "+contadorIntentos+" intentos");


            }
        }
        return usuario;

    }

    public String pedirContrasenha(){
        System.out.println("Introduce la contraseña");
        String contrasenha=sc.nextLine();
        return contrasenha;

    }

    public void comprobarUsuario(){




    }

}
