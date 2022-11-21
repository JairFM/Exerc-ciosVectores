package exercícios.práticos.vectores;
import java.util.Scanner;
public class hExercicio8 {


    public static void main(String[] args) {
       int [] pessoas = new int[5]; 
       int [] idade = new int[5];
       float [] altura = new float[5];
       
       Scanner read = new Scanner (System.in);
       
       for (int i = 0; i < pessoas.length; i++) {
          
           System.out.println("Insira a idade da " + (i+1) + "a pessoa");
           idade[i] = read.nextInt();
           System.out.println("Insira a altura da " + (i+1) + "a pessoa");
           altura[i] = read.nextFloat();
           
       }
       
       System.out.println("Ordem inversa: ");
       
       for (int i = pessoas.length - 1; i >= 0; i--) {
           
           System.out.println("" + (i+1) + "a idade --> " + idade[i]);
           System.out.println("" + (i+1) + "a altura --> " + altura[i]);
           
       }

    }
    
}
