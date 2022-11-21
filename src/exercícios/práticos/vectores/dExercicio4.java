package exercícios.práticos.vectores;
import java.io.IOException;
public class dExercicio4 {



    public static void main(String[] args) throws IOException {
        

        char [] palavras = new char[10];
        int contadorconsoante = 0;
       
      
        
        System.out.println("Insira os caracteres");
        
        for (int i = 0; i < palavras.length; i++) {
            
            palavras[i] = (char)System.in.read();
            
            
            if (palavras[i] != 'a' && palavras[i] != 'e' && palavras[i] != 'i' && palavras[i] != 'o' && palavras[i] != 'u') {
        
                contadorconsoante++;
                
            }
        }
        
        System.out.println("Total de caracteres lidos: " + palavras.length + "\nConsoantes lidas: "+ contadorconsoante);
        
        for (int i = 0; i < palavras.length; i++) {
            
            if (palavras[i] != 'a' && palavras[i] != 'e' && palavras[i] != 'i' && palavras[i] != 'o' && palavras[i] != 'u') {
        
                System.out.println("" + palavras[i]);
                
            }
        }
       
   }
              
}
