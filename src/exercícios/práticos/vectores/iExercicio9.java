package exercícios.práticos.vectores;
import java.util.Scanner;
public class iExercicio9 {


    public static void main(String[] args) {
        
        int[] A = new int[10];
        long soma = 0;
        
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < A.length; i++) {
            
            System.out.println("Insira o " + (i+1) + "o numero");
            A[i] = read.nextInt();
            soma = soma + (A[i] * A[i]);
            
        }
        
        System.out.println("Soma dos quadrados dos numeros inseridos --> " + soma);
    }
    
}
