package exercícios.práticos.vectores;
import java.util.Scanner;
public class eExercicio5 {


    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
       int [] numeros = new int[20]; 
       int [] par = new int[20];
       int [] impar = new int[20];
       
       for (int i = 0; i < numeros.length; i++) {
           
           System.out.println("Insira o " + (i+1) + "o numero");
           numeros[i] = read.nextInt();
           
           if (numeros[i] % 2 == 0) {
               
               par[i] = numeros[i];
               
           } else {
               
               impar[i] = numeros[i];
               
           }
           
           
       }
       
       for (int i = 0; i < numeros.length; i++) {
           
           System.out.println("" + (i+1) + "o numero: " + numeros[i]);
           
       }
       
       System.out.println("Numeros pares: ");
       
        for (int i = 0; i < numeros.length; i++) {
           if (par[i] != 0) {
               
               System.out.println("" + par[i]);
               
           }
           
           
       }
        
       System.out.println("Numeros impares: ");
       
        for (int i = 0; i < numeros.length; i++) {
           
            if (impar[i] != 0) {
               
               System.out.println("" + impar[i]);
               
           }
           
       }
       
    }
    
}
