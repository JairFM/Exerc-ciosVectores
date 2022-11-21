package exercícios.práticos.vectores;
import java.util.Scanner;
public class gExercicio7 {


    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        int soma = 0;
        long multiplicacao = 1;
        
        Scanner read = new Scanner (System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Insira o " + (i+1) + "o numero");
            numeros[i] = read.nextInt();
            
            soma = soma + numeros[i];
            multiplicacao = multiplicacao * numeros[i];
            
        }
        
        System.out.println("Numeros: ");
        
        for (int a = 0; a < numeros.length; a++) {
            
           System.out.println(""+ numeros[a]);
            
        }
        
        System.out.println("Soma --> " + soma);
        System.out.println("Multiplicacao --> " + multiplicacao);
       
    }
    
}
