package exercícios.práticos.vectores;
import java.util.Scanner;
public class bExercicio2 {


    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int numeros [] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Insira o "+ (i+1) + "o numero");
            numeros[i] = read.nextInt();
            
        }
        
        System.out.println("Numeros: ");
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            
            System.out.println("" + numeros[i]);
            
            
        }

    }
    
}
