package exercícios.práticos.vectores;
import java.util.Scanner;
public class fExercicio6 {


    public static void main(String[] args) {
        
        int[] qntalunos = new int[10];
        float [] notas = new float[4];
        float [] media = new float[10];
        float soma = 0;
        int countmedia = 0;
        
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < qntalunos.length; i++) {
            
            System.out.println("Insira as notas do "+ (i+1)+ "o aluno");
            
            for (int a = 0; a < notas.length; a++) {
                
                notas[a] = read.nextFloat();
                soma = soma + notas[a];
                
            }
            
            media[i] = soma/notas.length;
            soma = 0;

            
        }
        
        for (int i = 0; i < qntalunos.length; i++) {
            
            if (media[i] >= 7.0) {
                
                countmedia++;
                
            }
            
        }
        
        System.out.println("Numero de alunos com media igual ou superior a 7,0 ---> " + countmedia);

    }
    
}
