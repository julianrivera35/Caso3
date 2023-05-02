import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class Descifrador extends Thread {
    
    private String hash;
    private long noCaracteres;
    private long noAlgoritmo;
    private long id;
    private Random fuerzaBruta;


    //Este metodo convierte un array de bytes a un string en hexa.
    private String toHexadecimal(byte[] digest) {
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
    public String SHA256(String cadenaCaracteres) throws NoSuchAlgorithmException{
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
    public String SHA512(String cadenaCaracteres) throws NoSuchAlgorithmException{
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

    


    public Descifrador(String hash, long noCaracteres,long numeroAlgoritmo, long id, Random fuerza){
        this.hash = hash;
        this.noCaracteres = noCaracteres;
        this.id = id;
        this.noAlgoritmo = numeroAlgoritmo;
        this.fuerzaBruta = fuerza;
    }

    public Descifrador(){
        this.hash = "";
        this.noCaracteres = 0;
        this.id = -1;
    }

    public String getHash(){
        return this.hash;
    }

    public long getId(){
        return this.id;
    }

    public long getnoCaracteres(){
        return this.noCaracteres;
    }

    public long getAlgoritmo(){
        return this.noAlgoritmo;
    }
    

    public void run(){
        List<String> rta = new ArrayList<String>();
        List<String> rta2= new ArrayList<String>();
        if((int)getId() == 0){
            rta=fuerzaBruta.fuerzaBruta((int)getnoCaracteres(), getHash(), (int)getAlgoritmo());
            System.out.println("Ha termiando el proceso con id: " + (int)getId());
        }
        else{
            if((int)getId() == 1){
                rta2 = fuerzaBruta.fuerzaBrutaAlReves((int)getnoCaracteres(), getHash(), (int)getAlgoritmo());
                System.out.println("Ha termiando el proceso con id: " + (int)getId());
            }
        }
        
        if(rta.size() !=0){
            if(rta.get(rta.size()-1).equals("y")){
                System.out.println(rta);
            }
            else{
                System.out.println(rta2);
            }

        }
        else{
            System.out.println(rta2);
        }
        

    }
}
