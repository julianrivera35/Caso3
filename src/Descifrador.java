import java.security.*;
import java.nio.charset.StandardCharsets;

public class Descifrador extends Thread {
    
    private String hash;
    private int noCaracteres;
    int abarca;


    //Este metodo convierte un array de bytes a un string en hexa.
    private static String toHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) {
                hash += "0";
            }
            hash += Integer.toHexString(b);
        }
        return hash;
    }

    //Metodo para sacar el hash de un string usando el algoritmo SHA256
    public static String SHA256(String cadenaCaracteres) throws NoSuchAlgorithmException{
        try{
            MessageDigest HashSHA256 = MessageDigest.getInstance("SHA-256");
            byte[] buffer = HashSHA256.digest(cadenaCaracteres.getBytes(StandardCharsets.UTF_8));
            String hash256 = toHexadecimal(buffer);
            return hash256;
            
        }
        catch(NoSuchAlgorithmException e){
            System.out.println("Hubo un problema calculando el hash.");
            return "";
        }
    

    }


    //Metodo para sacar el hash de un string usando el algoritmo SHA512
    public static String SHA512(String cadenaCaracteres) throws NoSuchAlgorithmException{
        try{
            MessageDigest HashSHA256 = MessageDigest.getInstance("SHA-512");
            byte[] buffer = HashSHA256.digest(cadenaCaracteres.getBytes(StandardCharsets.UTF_8));
            String hash256 = toHexadecimal(buffer);
            return hash256;
            
        }
        catch(NoSuchAlgorithmException e){
            System.out.println("Hubo un problema calculando el hash.");
            return "";
        }
    

    }

    


    public Descifrador(String hash, int noCaracteres,int numeroAlgoritmo, int abarca){
        this.hash = hash;
        this.noCaracteres = noCaracteres;
        this.abarca = abarca;
    }

    public void fuerzaBruta(String hash, int noCaracteres, int abarca){
        int posibilidades = 0;
    }

    public void run(){

    }
}
