import java.util.Scanner;
import java.security.*;

public class App {

    private static String contrasenaInicial;
    private static int numeroAlgoritmo;
    private static int numeroThreads;
    private static String salt;
    

    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al código de decodificación de Hash, prepárese para esperar 45 horas por su resultado ;D");
        System.out.println("\n");
        System.out.println("Por favor escriba la contraseña que trataremos de descifrar:");
        contrasenaInicial = teclado.nextLine();
        System.out.println("\n Por favor elija un algoritmo de hash:");
        System.out.println("\n");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        numeroAlgoritmo = teclado.nextInt();
        System.out.println("\n");
        System.out.println("Por favor digite un cadena de 2 caracteres (salt):");
        salt = teclado.next();
        System.out.println("\nDigite 1 o 2 para definir la cantidad de threads que se van a usar:");
        numeroThreads = teclado.nextInt();

        teclado.close();
    }
    public static void main(String[] args) throws Exception {
        menu();

    }
}
