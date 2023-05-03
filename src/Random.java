import java.util.*;

public class Random {


    private boolean centinela_compartido = true;
    private Descifrador hashing = new Descifrador();

    public boolean getCentinela(){
        return centinela_compartido;
    }

    public void offCentinela(){
        this.centinela_compartido = false;
    }
    public List<String> fuerzaBruta(int noCaracteres, String hash, int algoritmo) {
        String cadena = "";
        long initTime = System.nanoTime();
        String encontrado= "n";
        if(algoritmo == 1){
            
            if(noCaracteres == 1){
                for(char c1 = 'a'; c1 <= 'z' && getCentinela(); c1++){
                        cadena = ""+c1;
                        try {
                            String hashCadena = hashing.SHA256(cadena);
                            if(hashCadena.equals(hash)){
                                encontrado = "y";
                                offCentinela();
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        
                    
                }
            }
            else{
                if(noCaracteres ==2){
                    for(char c1 = 'a'; c1 <= 'z' && getCentinela(); c1++){
                        for(char c2 = 'a'; c2 <= 'z' && getCentinela(); c2++){
                            cadena = ""+c1+c2;
                            try {
                                String hashCadena = hashing.SHA256(cadena);
                                if(hashCadena.equals(hash)){
                                    encontrado = "y";
                                    offCentinela();
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
                        for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                            for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                    cadena = ""+c1+c2+c3;
                                    try {
                                        String hashCadena = hashing.SHA256(cadena);
                                        if(hashCadena.equals(hash)){
                                            encontrado = "y";
                                            offCentinela();
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
                            for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                    for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                        for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                            cadena = ""+c1+c2+c3+c4;
                                            try {
                                                String hashCadena = hashing.SHA256(cadena);
                                                if(hashCadena.equals(hash)){
                                                    encontrado = "y";
                                                    offCentinela();
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
                                for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                    for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                        for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                            for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                    cadena = ""+c1+c2+c3+c4+c5;
                                                    try {
                                                        String hashCadena = hashing.SHA256(cadena);
                                                        if(hashCadena.equals(hash)){
                                                            encontrado = "y";
                                                            offCentinela();
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
                                    for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                        for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                            for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                    for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                        for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                            cadena = ""+c1+c2+c3+c4+c5+c6;
                                                            try {
                                                                String hashCadena = hashing.SHA256(cadena);
                                                                if(hashCadena.equals(hash)){
                                                                    encontrado = "y";
                                                                    offCentinela();
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
                                        for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                            for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                                for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                    for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                        for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                            for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                                for(char c7 = 'a'; c7 <= 'z'&& getCentinela(); c7++){
                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7;
                                                                    try {
                                                                        String hashCadena = hashing.SHA256(cadena);
                                                                        if(hashCadena.equals(hash)){
                                                                            encontrado = "y";
                                                                            offCentinela();
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
                                    else{
                                        if(noCaracteres == 8){
                                            for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                                for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                                    for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                        for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                            for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                                for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                                    for(char c7 = 'a'; c7 <= 'z'&& getCentinela(); c7++){
                                                                        for(char c8 = 'a'; c8 <= 'z'&& getCentinela(); c8++){
                                                                            cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8;
                                                                            //System.out.println(cadena);
                                                                            try {
                                                                                String hashCadena = hashing.SHA256(cadena);
                                                                                if(hashCadena.equals(hash)){
                                                                                    encontrado = "y";
                                                                                    offCentinela();;
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
                                        else{
                                            if(noCaracteres == 9){
                                                for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                                    for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                                        for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                            for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                                for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                                    for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                                        for(char c7 = 'a'; c7 <= 'z'&& getCentinela(); c7++){
                                                                            for(char c8 = 'a'; c8 <= 'z'&& getCentinela(); c8++){
                                                                                for(char c9 = 'a'; c8 <= 'z'&& getCentinela(); c9++){
                                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8+c9;
                                                                                    try {
                                                                                        String hashCadena = hashing.SHA256(cadena);
                                                                                        if(hashCadena.equals(hash)){
                                                                                            encontrado = "y";
                                                                                            offCentinela();
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

                    }
                }
            }
        }
        else{
            if(noCaracteres == 1){
                for(char c1 = 'a'; c1 <= 'z' && getCentinela(); c1++){
                        cadena = ""+c1;
                        try {
                            String hashCadena = hashing.SHA512(cadena);
                            if(hashCadena.equals(hash)){
                                encontrado = "y";
                                offCentinela();
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        
                    
                }
            }
            else{
                if(noCaracteres ==2){
                    for(char c1 = 'a'; c1 <= 'z' && getCentinela(); c1++){
                        for(char c2 = 'a'; c2 <= 'z' && getCentinela(); c2++){
                            cadena = ""+c1+c2;
                            try {
                                String hashCadena = hashing.SHA512(cadena);
                                if(hashCadena.equals(hash)){
                                    encontrado = "y";
                                    offCentinela();
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
                        for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                            for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                    cadena = ""+c1+c2+c3;
                                    try {
                                        String hashCadena = hashing.SHA512(cadena);
                                        if(hashCadena.equals(hash)){
                                            encontrado = "y";
                                            offCentinela();
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
                            for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                    for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                        for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                            cadena = ""+c1+c2+c3+c4;
                                            try {
                                                String hashCadena = hashing.SHA512(cadena);
                                                if(hashCadena.equals(hash)){
                                                    encontrado = "y";
                                                    offCentinela();
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
                                for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                    for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                        for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                            for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                    cadena = ""+c1+c2+c3+c4+c5;
                                                    try {
                                                        String hashCadena = hashing.SHA512(cadena);
                                                        if(hashCadena.equals(hash)){
                                                            encontrado = "y";
                                                            offCentinela();
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
                                    for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                        for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                            for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                    for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                        for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                            cadena = ""+c1+c2+c3+c4+c5+c6;
                                                            try {
                                                                String hashCadena = hashing.SHA512(cadena);
                                                                if(hashCadena.equals(hash)){
                                                                    encontrado = "y";
                                                                    offCentinela();
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
                                        for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                            for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                                for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                    for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                        for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                            for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                                for(char c7 = 'a'; c7 <= 'z'&& getCentinela(); c7++){
                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7;
                                                                    try {
                                                                        String hashCadena = hashing.SHA512(cadena);
                                                                        if(hashCadena.equals(hash)){
                                                                            encontrado = "y";
                                                                            offCentinela();
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
                                    else{
                                        if(noCaracteres == 8){
                                            
                                            for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                                for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                                    for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                        for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                            for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                                for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                                    for(char c7 = 'a'; c7 <= 'z'&& getCentinela(); c7++){
                                                                        for(char c8 = 'a'; c8 <= 'z'&& getCentinela(); c8++){
                                                                            cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8;
                                                                            try {
                                                                                String hashCadena = hashing.SHA512(cadena);
                                                                                if(hashCadena.equals(hash)){
                                                                                    encontrado = "y";
                                                                                    offCentinela();
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
                                        else{
                                            if(noCaracteres == 9){
                                                for(char c1 = 'a'; c1 <= 'z'&& getCentinela(); c1++){
                                                    for(char c2 = 'a'; c2 <= 'z'&& getCentinela(); c2++){
                                                        for(char c3 = 'a'; c3 <= 'z'&& getCentinela(); c3++){
                                                            for(char c4 = 'a'; c4 <= 'z'&& getCentinela(); c4++){
                                                                for(char c5 = 'a'; c5 <= 'z'&& getCentinela(); c5++){
                                                                    for(char c6 = 'a'; c6 <= 'z'&& getCentinela(); c6++){
                                                                        for(char c7 = 'a'; c7 <= 'z'&& getCentinela(); c7++){
                                                                            for(char c8 = 'a'; c8 <= 'z'&& getCentinela(); c8++){
                                                                                for(char c9 = 'a'; c8 <= 'z'&& getCentinela(); c9++){
                                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8+c9;
                                                                                    try {
                                                                                        String hashCadena = hashing.SHA512(cadena);
                                                                                        if(hashCadena.equals(hash)){
                                                                                            encontrado = "y";
                                                                                            offCentinela();
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

                    }
                }
            }

        }
        
        long endTime = System.nanoTime();

        long duration = (endTime - initTime)/1000000;
        String durationS = duration + " ms ";
        String numeroCaracteres = ""+noCaracteres;
        String sal = cadena.substring(noCaracteres -2);
        String password = cadena.substring(0, noCaracteres-2);
        List<String> retorno = new ArrayList<String>();
        retorno.add(numeroCaracteres);
        retorno.add(durationS);
        retorno.add(cadena);
        retorno.add(password);
        retorno.add(sal);
        retorno.add(hash);
        retorno.add(encontrado);
        if (encontrado.equals("n")){
            retorno = null;
        }
        return retorno;
    }


    public List<String> fuerzaBrutaAlReves(int noCaracteres, String hash, int algoritmo){

        String cadena = "";
        long initTime = System.nanoTime();
        String encontrado = "n";
        if(algoritmo == 1){
            
            if(noCaracteres == 1){
                for(char c1 = 'z'; c1 >= 'a' && getCentinela(); c1--){
                        cadena = ""+c1;
                        try {
                            String hashCadena = hashing.SHA256(cadena);
                            if(hashCadena.equals(hash)){
                                encontrado = "y";
                                offCentinela();
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        
                    
                }
            }
            else{
                if(noCaracteres ==2){
                    for(char c1 = 'z'; c1 >= 'a' && getCentinela(); c1--){
                        for(char c2 = 'z'; c2 >= 'a' && getCentinela(); c2--){
                            cadena = ""+c1+c2;
                            try {
                                String hashCadena = hashing.SHA256(cadena);
                                if(hashCadena.equals(hash)){
                                    encontrado = "y";
                                    offCentinela();
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
                        for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                            for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                    cadena = ""+c1+c2+c3;
                                    try {
                                        String hashCadena = hashing.SHA256(cadena);
                                        if(hashCadena.equals(hash)){
                                            encontrado = "y";
                                            offCentinela();
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
                            for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                    for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                        for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                            cadena = c1+c2+c3+c4+"";
                                            try {
                                                String hashCadena = hashing.SHA256(cadena);
                                                if(hashCadena.equals(hash)){
                                                    encontrado = "y";
                                                    offCentinela();
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
                                for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                    for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                        for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                            for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                    cadena = ""+c1+c2+c3+c4+c5;
                                                    try {
                                                        String hashCadena = hashing.SHA256(cadena);
                                                        if(hashCadena.equals(hash)){
                                                            encontrado = "y";
                                                            offCentinela();
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
                                    for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                        for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                            for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                    for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                        for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                            cadena = ""+c1+c2+c3+c4+c5+c6;
                                                            try {
                                                                String hashCadena = hashing.SHA256(cadena);
                                                                if(hashCadena.equals(hash)){
                                                                    encontrado = "y";
                                                                    offCentinela();
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
                                        for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                            for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                                for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                    for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                        for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                            for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                                for(char c7 = 'z'; c7 >= 'a'&& getCentinela(); c7--){
                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7;
                                                                    try {
                                                                        String hashCadena = hashing.SHA256(cadena);
                                                                        if(hashCadena.equals(hash)){
                                                                            encontrado = "y";
                                                                            offCentinela();
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
                                    else{
                                        if(noCaracteres == 8){
                                            
                                            for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                                for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                                    for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                        for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                            for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                                for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                                    for(char c7 = 'z'; c7 >= 'a'&& getCentinela(); c7--){
                                                                        for(char c8 = 'z'; c8 >= 'a'&& getCentinela(); c8--){
                                                                            cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8;
                                                                            try {
                                                                                String hashCadena = hashing.SHA512(cadena);
                                                                                if(hashCadena.equals(hash)){
                                                                                    encontrado = "y";
                                                                                    offCentinela();
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
                                        else{
                                            if(noCaracteres == 9){
                                                for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                                    for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                                        for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                            for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                                for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                                    for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                                        for(char c7 = 'z'; c7 >= 'a'&& getCentinela(); c7--){
                                                                            for(char c8 = 'z'; c8 >= 'a'&& getCentinela(); c8--){
                                                                                for(char c9 = 'z'; c9 >= 'a'&& getCentinela(); c9--){
                                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8+c9;
                                                                                    try {
                                                                                        String hashCadena = hashing.SHA512(cadena);
                                                                                        if(hashCadena.equals(hash)){
                                                                                            encontrado = "y";
                                                                                            offCentinela();
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

                    }
                }
            }
        }
        else{
            if(noCaracteres == 1){
                for(char c1 = 'z'; c1 >= 'a' && getCentinela(); c1--){
                        cadena = ""+c1;
                        try {
                            String hashCadena = hashing.SHA512(cadena);
                            if(hashCadena.equals(hash)){
                                encontrado = "y";
                                offCentinela();
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                        
                    
                }
            }
            else{
                if(noCaracteres ==2){
                    for(char c1 = 'z'; c1 >= 'a' && getCentinela(); c1--){
                        for(char c2 = 'z'; c2 >= 'a' && getCentinela(); c2--){
                            cadena = ""+c1+c2;
                            try {
                                String hashCadena = hashing.SHA512(cadena);
                                if(hashCadena.equals(hash)){
                                    encontrado = "y";
                                    offCentinela();
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
                        for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                            for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                    cadena = ""+c1+c2+c3;
                                    try {
                                        String hashCadena = hashing.SHA512(cadena);
                                        if(hashCadena.equals(hash)){
                                            encontrado = "y";
                                            offCentinela();
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
                            for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                    for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                        for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                            cadena = ""+c1+c2+c3+c4;
                                            try {
                                                String hashCadena = hashing.SHA512(cadena);
                                                if(hashCadena.equals(hash)){
                                                    encontrado = "y";
                                                    offCentinela();
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
                                for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                    for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                        for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                            for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                    cadena = ""+c1+c2+c3+c4+c5;
                                                    try {
                                                        String hashCadena = hashing.SHA512(cadena);
                                                        if(hashCadena.equals(hash)){
                                                            encontrado = "y";
                                                            offCentinela();
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
                                    for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                        for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                            for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                    for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                        for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                            cadena = ""+c1+c2+c3+c4+c5+c6;
                                                            try {
                                                                String hashCadena = hashing.SHA512(cadena);
                                                                if(hashCadena.equals(hash)){
                                                                    encontrado = "y";
                                                                    offCentinela();
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
                                        for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                            for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                                for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                    for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                        for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                            for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                                for(char c7 = 'z'; c7 >= 'a'&& getCentinela(); c7--){
                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7;
                                                                    try {
                                                                        String hashCadena = hashing.SHA512(cadena);
                                                                        if(hashCadena.equals(hash)){
                                                                            encontrado = "y";
                                                                            offCentinela();
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
                                    else{
                                        if(noCaracteres == 8){
                                            
                                            for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                                for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                                    for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                        for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                            for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                                for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                                    for(char c7 = 'z'; c7 >= 'a'&& getCentinela(); c7--){
                                                                        for(char c8 = 'z'; c8 >= 'a'&& getCentinela(); c8--){
                                                                            cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8;
                                                                            try {
                                                                                String hashCadena = hashing.SHA512(cadena);
                                                                                if(hashCadena.equals(hash)){
                                                                                    encontrado = "y";
                                                                                    offCentinela();
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
                                        else{
                                            if(noCaracteres == 9){
                                                for(char c1 = 'z'; c1 >= 'a'&& getCentinela(); c1--){
                                                    for(char c2 = 'z'; c2 >= 'a'&& getCentinela(); c2--){
                                                        for(char c3 = 'z'; c3 >= 'a'&& getCentinela(); c3--){
                                                            for(char c4 = 'z'; c4 >= 'a'&& getCentinela(); c4--){
                                                                for(char c5 = 'z'; c5 >= 'a'&& getCentinela(); c5--){
                                                                    for(char c6 = 'z'; c6 >= 'a'&& getCentinela(); c6--){
                                                                        for(char c7 = 'z'; c7 >= 'a'&& getCentinela(); c7--){
                                                                            for(char c8 = 'z'; c8 >= 'a'&& getCentinela(); c8--){
                                                                                for(char c9 = 'z'; c9 >= 'a'&& getCentinela(); c9--){
                                                                                    cadena = ""+c1+c2+c3+c4+c5+c6+c7+c8+c9;
                                                                                    try {
                                                                                        String hashCadena = hashing.SHA512(cadena);
                                                                                        if(hashCadena.equals(hash)){
                                                                                            encontrado = "y";
                                                                                            offCentinela();
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

                    }
                }
            }

        }
        
        long endTime = System.nanoTime();

        long duration = (endTime - initTime)/1000000;
        String durationS = duration + " ms ";
        String numeroCaracteres = ""+noCaracteres;
        String sal = cadena.substring(noCaracteres-2);
        String password = cadena.substring(0, noCaracteres-2);
        List<String> retorno = new ArrayList<String>();
        retorno.add(numeroCaracteres);
        retorno.add(durationS);
        retorno.add(cadena);
        retorno.add(password);
        retorno.add(sal);
        retorno.add(hash);
        retorno.add(encontrado);
        if (encontrado.equals("n")){
            retorno = null;
        }
        return retorno;


    }



    
}
