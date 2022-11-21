package exercícios.práticos.vectores;
import java.util.Scanner;
public class jExercicio10 {
    


    public static void main(String[] args) {
        
        int [] A = new int[10];
        int [] B = new int[10];
        int [] C = new int[20];
        int a = 0;

        
        Scanner read = new Scanner(System.in);
        
        
        for (int i = 0; i < A.length; i++) {
            
            System.out.println("Insira o " + (i+1) + "o valor do vector A");
            A[i] = read.nextInt();  
        }
        
        for (int i = 0; i < B.length; i++) {
            
            System.out.println("Insira o " + (i+1) + "o valor do vector B");
            B[i] = read.nextInt();
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            C[a] = A[i];
            a++;
            C[a] = B[i];
            a++; 
        }
        
        System.out.println("Valores do vector 3:");
        
        for (a = 0; a < C.length; a++) {
            
            System.out.println("" + C[a]);
            
        }

    }
    
}
