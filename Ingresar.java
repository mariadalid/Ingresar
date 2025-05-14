import java.util.Scanner;
public class Ingresar {
    private static final Scanner scanner = new Scanner(System.in);
    public static String obtnerCadena(String mensaje){
        String cadenaTemporal;
        System.out.print(mensaje + ": ");
        cadenaTemporal = scanner.nextLine();
        return cadenaTemporal;
    }
    //Iniciar sesion
    public static void main (String[] args) {
        String nombreUsuario = "La_nanis";
        String contrasenaUsuario = "32514";
        String usuarioIngresado = obtnerCadena("Ingresa tu usuario");
        String contrasenaIngresada = obtnerCadena("Ingresa tu contraseña");

        if((nombreUsuario.equals(usuarioIngresado)) && (contrasenaIngresada.equals(contrasenaUsuario))){
            System.out.println("Inicio de sesión, exitoso!");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }
}