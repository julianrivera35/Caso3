import java.util.Scanner;
import java.security.*;

public class App {

    private static String contrasenaInicial;
    private static int numeroAlgoritmo;
    private static int numeroThreads;
    private static String salt;
    

    public static void menu(){
        //Menu donde pedimos los datos necesarios para correr el programa
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al código de decodificación de Hash, prepárese para esperar 45 horas por su resultado ;D");
        System.out.println("\n");
        System.out.println("Por favor escriba la contraseña que trataremos de descifrar:");
        contrasenaInicial = teclado.nextLine();
        System.out.println("\n Por favor elija un algoritmo de hash:");
        System.out.println("\n");
        System.out.println("1. MD5");
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
        String concat = contrasenaInicial+salt;
        //El tamanio de la cadena de caracteres se le pasa al thread descifrador como una pista para saber que cantidad de combinaciones probar
        int tamConcat = concat.length();

        //Como solo se puede trabajar con 1 o 2 threads entonces solo usamos un condicional.
        if(numeroThreads == 1){
            Descifrador thread = new Descifrador(concat, tamConcat,numeroAlgoritmo,0);
            thread.start();
        }
        else{
            Descifrador thread1 = new Descifrador(concat, tamConcat,numeroAlgoritmo,1);
            Descifrador thread2 = new Descifrador(concat, tamConcat,numeroAlgoritmo,2);
            thread1.start();
            thread2.start();
        }

    }
}
