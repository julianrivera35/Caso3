import java.util.concurrent.TimeUnit;

public class Random {

    public static void fuerzaBruta(int noCaracteres, String hash, int algoritmo) {
        String cadena = "";
        long initTime = System.nanoTime();
        boolean centinela = true;
        if(algoritmo == 1){
            
            if(noCaracteres == 1){
                for(char c1 = 'a'; c1 <= 'z' && centinela; c1++){
                        cadena = ""+c1;
                        try {
                            String hashCadena = Descifrador.SHA256(cadena);
                            if(hashCadena.equals(hash)){
                                centinela = false;
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        
                    
                }
            }
            else{
                if(noCaracteres ==2){
                    for(char c1 = 'a'; c1 <= 'z' && centinela; c1++){
                        for(char c2 = 'a'; c2 <= 'z' && centinela; c2++){
                            cadena = ""+c1+c2;
                            try {
                                String hashCadena = Descifrador.SHA256(cadena);
                                if(hashCadena.equals(hash)){
                                    centinela = false;
                                }
                            } catch (Exception e) {
                                // TODO: handle exception
                            }
                            
                        } 
                    }

                }
                else
                {
                    if(noCaracteres == 3)
                    {
                        for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                            for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                    cadena = ""+c1+c2+c3;
                                    try {
                                        String hashCadena = Descifrador.SHA256(cadena);
                                        if(hashCadena.equals(hash)){
                                            centinela = false;
                                        }
                                    } catch (Exception e) {
                                        // TODO: handle exception
                                    }
                                    
                                }
                            } 
                        }

                    }
                    else{
                        if(noCaracteres==4){
                            for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                    for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                        for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                            cadena = ""+c1+c2+c3+c4;
                                            try {
                                                String hashCadena = Descifrador.SHA256(cadena);
                                                if(hashCadena.equals(hash)){
                                                    centinela = false;
                                                }
                                            } catch (Exception e) {
                                                // TODO: handle exception
                                            }
                                            
                                        }
                                    }
                                } 
                            }

                        }
                        else{
                            if(noCaracteres==5){
                                for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                    for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                        for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                            for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                                for(char c5 = 'a'; c5 <= 'z'&& centinela; c5++){
                                                    cadena = ""+c1+c2+c3+c4+c5;
                                                    try {
                                                        String hashCadena = Descifrador.SHA256(cadena);
                                                        if(hashCadena.equals(hash)){
                                                            centinela = false;
                                                        }
                                                    } catch (Exception e) {
                                                        // TODO: handle exception
                                                    }
                                                    
                                                }
                                            }
                                        }
                                    } 
                                }

                            }
                            else{
                                if(noCaracteres == 6){
                                    for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                        for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                            for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                                for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                                    for(char c5 = 'a'; c5 <= 'z'&& centinela; c5++){
                                                        for(char c6 = 'a'; c6 <= 'z'&& centinela; c6++){
                                                            cadena = ""+c1+c2+c3+c4+c5+c6;
                                                            try {
                                                                String hashCadena = Descifrador.SHA256(cadena);
                                                                if(hashCadena.equals(hash)){
                                                                    centinela = false;
                                                                }
                                                            } catch (Exception e) {
                                                                // TODO: handle exception
                                                            }
                                                            
                                                        }
                                                    }
                                                }
                                            }
                                        } 
                                    }

                                }
                                else{
                                    if(noCaracteres == 7){
                                        for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                            for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                                for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                                    for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                                        for(char c5 = 'a'; c5 <= 'z'&& centinela; c5++){
                                                            for(char c6 = 'a'; c6 <= 'z'&& centinela; c6++){
                                                                for(char c7 = 'a'; c7 <= 'z'&& centinela; c7++){
                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7;
                                                                    try {
                                                                        String hashCadena = Descifrador.SHA256(cadena);
                                                                        if(hashCadena.equals(hash)){
                                                                            centinela = false;
                                                                        }
                                                                    } catch (Exception e) {
                                                                        // TODO: handle exception
                                                                    }
                                                                    
                                                                    
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } 
                                        }
                                        
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        else{
            if(noCaracteres == 1){
                for(char c1 = 'a'; c1 <= 'z' && centinela; c1++){
                        cadena = ""+c1;
                        try {
                            String hashCadena = Descifrador.SHA512(cadena);
                            if(hashCadena.equals(hash)){
                                centinela = false;
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        
                    
                }
            }
            else{
                if(noCaracteres ==2){
                    for(char c1 = 'a'; c1 <= 'z' && centinela; c1++){
                        for(char c2 = 'a'; c2 <= 'z' && centinela; c2++){
                            cadena = ""+c1+c2;
                            try {
                                String hashCadena = Descifrador.SHA512(cadena);
                                if(hashCadena.equals(hash)){
                                    centinela = false;
                                }
                            } catch (Exception e) {
                                // TODO: handle exception
                            }
                            
                        } 
                    }

                }
                else
                {
                    if(noCaracteres == 3)
                    {
                        for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                            for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                    cadena = ""+c1+c2+c3;
                                    try {
                                        String hashCadena = Descifrador.SHA512(cadena);
                                        if(hashCadena.equals(hash)){
                                            centinela = false;
                                        }
                                    } catch (Exception e) {
                                        // TODO: handle exception
                                    }
                                    
                                }
                            } 
                        }

                    }
                    else{
                        if(noCaracteres==4){
                            for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                    for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                        for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                            cadena = ""+c1+c2+c3+c4;
                                            try {
                                                String hashCadena = Descifrador.SHA512(cadena);
                                                if(hashCadena.equals(hash)){
                                                    centinela = false;
                                                }
                                            } catch (Exception e) {
                                                // TODO: handle exception
                                            }
                                            
                                        }
                                    }
                                } 
                            }

                        }
                        else{
                            if(noCaracteres==5){
                                for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                    for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                        for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                            for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                                for(char c5 = 'a'; c5 <= 'z'&& centinela; c5++){
                                                    cadena = ""+c1+c2+c3+c4+c5;
                                                    try {
                                                        String hashCadena = Descifrador.SHA512(cadena);
                                                        if(hashCadena.equals(hash)){
                                                            centinela = false;
                                                        }
                                                    } catch (Exception e) {
                                                        // TODO: handle exception
                                                    }
                                                    
                                                }
                                            }
                                        }
                                    } 
                                }

                            }
                            else{
                                if(noCaracteres == 6){
                                    for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                        for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                            for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                                for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                                    for(char c5 = 'a'; c5 <= 'z'&& centinela; c5++){
                                                        for(char c6 = 'a'; c6 <= 'z'&& centinela; c6++){
                                                            cadena = ""+c1+c2+c3+c4+c5+c6;
                                                            try {
                                                                String hashCadena = Descifrador.SHA512(cadena);
                                                                if(hashCadena.equals(hash)){
                                                                    centinela = false;
                                                                }
                                                            } catch (Exception e) {
                                                                // TODO: handle exception
                                                            }
                                                            
                                                        }
                                                    }
                                                }
                                            }
                                        } 
                                    }

                                }
                                else{
                                    if(noCaracteres == 7){
                                        for(char c1 = 'a'; c1 <= 'z'&& centinela; c1++){
                                            for(char c2 = 'a'; c2 <= 'z'&& centinela; c2++){
                                                for(char c3 = 'a'; c3 <= 'z'&& centinela; c3++){
                                                    for(char c4 = 'a'; c4 <= 'z'&& centinela; c4++){
                                                        for(char c5 = 'a'; c5 <= 'z'&& centinela; c5++){
                                                            for(char c6 = 'a'; c6 <= 'z'&& centinela; c6++){
                                                                for(char c7 = 'a'; c7 <= 'z'&& centinela; c7++){
                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7;
                                                                    try {
                                                                        String hashCadena = Descifrador.SHA512(cadena);
                                                                        if(hashCadena.equals(hash)){
                                                                            centinela = false;
                                                                        }
                                                                    } catch (Exception e) {
                                                                        // TODO: handle exception
                                                                    }
                                                                    
                                                                    
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } 
                                        }
                                        
                                    }
                                }
                            }
                        }

                    }
                }
            }

        }
        
        long endTime = System.nanoTime();

        long duration = (endTime - initTime)/1000000;
        System.out.println(cadena);
        System.out.println(duration + " ms");
        
    }


    public void primeraMitad(){

    }

    public static void main(String[] args){
        fuerzaBruta(3,"501331ba42ea561ce5df8a824df17e3fddfef6dacdc9fa3677010b7c28a886cc",1);

    }
}
