package exercícios.práticos.vectores;
import java.util.Scanner;
public class cExercicio3 {



    public static void main(String[] args) {
    float[] notas = new float[4];
    float media = 0;
    
    Scanner read = new Scanner(System.in);
    
    for (int i = 0; i < notas.length; i++){
        
        System.out.println("Insira a " + (i+1) + "a nota");
        notas[i] = read.nextFloat();
        media = media + notas[i];
        
        if (i == 3) {
            
            i++;
            media = media/i;
            
        }
        
    }
        
        for (int i = 0; i < notas.length; i++){
        
        System.out.println("" + (i+1) + "a nota: "+ notas[i]);
        
    }
        
        System.out.println("Media das notas: "+ media);
        
        

}
}
