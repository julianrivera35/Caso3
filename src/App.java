import java.util.Scanner;


public class App {

    /**
     * Contraseña que se va a intentar decifrar
     */
    private static String contrasenaInicial;
    /**
     * Algoritmo de hash que vamos a utilizar 1 para 256, 2 para 512
     */
    private static int numeroAlgoritmo;
    /**
     * Número de threads que van a buscar la solucion puede ser 1 o 2
     */
    private static int numeroThreads;
    /**
     * Sal que se le va a adjuntar a la contraseña
     */
    private static String salt;
    
    /**
     * Menu del programa donde vamos a recibir todos los parametros para la ejecucion
     */
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al código de decodificación de Hash");
        System.out.println("Por favor escriba la contraseña que trataremos de descifrar:");
        while(contrasenaInicial == null){
            contrasenaInicial = teclado.nextLine();
            if (contrasenaInicial.length()> 7 || contrasenaInicial.length()< 1 || !contrasenaInicial.matches("^[a-z]+$")){
                contrasenaInicial = null;
                System.out.println("La contraseña ingresada no es válida intente nuevamente");
            }
        }
        System.out.println("Por favor elija un algoritmo de hash utilizando el número:");
        System.out.println("1. SHA-256");
        System.out.println("2. SHA-512");
        numeroAlgoritmo = 0;
        while(numeroAlgoritmo == 0){
            try{
                numeroAlgoritmo = Integer.parseInt(teclado.nextLine());
                if (numeroAlgoritmo != 1 && numeroAlgoritmo != 2 ){
                    numeroAlgoritmo = 0;
                    System.out.println("El número no es válido, debe ser entre 1 y 2");
                }
            }
            catch (Exception e){
                System.out.println("Debes ingresar un número");
            }
           
        }
        System.out.println("Por favor digite un cadena de 2 caracteres (salt):");
        while(salt == null){
            salt = teclado.next();
            if (salt.length()> 2 || salt.length()< 1 || !salt.matches("^[a-z]+$")){
                salt = null;
                System.out.println("La sal ingresada no es válida intente nuevamente");
            }
        }
        System.out.println("Digite 1 o 2 para definir la cantidad de threads que se van a usar:");
        numeroThreads = 0;
        while(numeroThreads == 0){
            try{
                numeroThreads = Integer.parseInt(teclado.next());
                if (numeroThreads != 1 && numeroThreads != 2 ){
                    numeroThreads = 0;
                    System.out.println("El número no es válido, debe ser entre 1 y 2");
                }
            }
            catch (Exception e){
                System.out.println("Debes ingresar un número ");
                e.printStackTrace();
            }
           
        }
        teclado.close();
    }
    public static void main(String[] args) throws Exception {
        menu();
        String concat = contrasenaInicial+salt;
        //El tamanio de la cadena de caracteres se le pasa al thread descifrador como una pista para saber que cantidad de combinaciones probar
        int tamConcat = concat.length();
        Descifrador hashing = new Descifrador();
        Random fuerzaBruta = new Random();
        //Calculamos el hash
        String hash =" ";
        if(numeroAlgoritmo == 1){
            hash = hashing.SHA256(concat);
            System.out.println(hash);
            
        }
        else{
            hash = hashing.SHA512(concat);
            System.out.println(hash);
        }

        //Como solo se puede trabajar con 1 o 2 threads entonces solo usamos un condicional.
        if(numeroThreads == 1){
            Descifrador thread = new Descifrador(hash, tamConcat,numeroAlgoritmo,0,fuerzaBruta);
            thread.start();
        }
        else{
            Descifrador thread1 = new Descifrador(hash, tamConcat,numeroAlgoritmo,0,fuerzaBruta);
            Descifrador thread2 = new Descifrador(hash, tamConcat,numeroAlgoritmo,1, fuerzaBruta);
            thread1.start();
            thread2.start();
        }

    }
}
