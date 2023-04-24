import java.security.*;

import javax.swing.undo.CannotRedoException;

public class Descifrador extends Thread {
    
    private String hash;
    private int noCaracteres;
    int abarca;

    public static String MD5(String cadenaCaracteres) throws NoSuchAlgorithmException{
        
        MessageDigest HashMD5 = MessageDigest.getInstance("MD5");
        byte[] buffer = HashMD5.digest(cadenaCaracteres.getBytes());

        return "ya lo termino";
    

    }


    public Descifrador(String hash, int noCaracteres,int numeroAlgoritmo, int abarca){
        this.hash = hash;
        this.noCaracteres = noCaracteres;
        this.abarca = abarca;
    }


    public void run(){

    }
}
