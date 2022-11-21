package exercícios.práticos.vectores;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class nExercicio14 {


    public static void main(String[] args) {
        int classi = 0;
        
        Scanner read = new Scanner (System.in);
        List <String> perguntas = new ArrayList();
        List <String> respostas = new ArrayList();
        
        perguntas.add("Telefonou para a vitima ?");
        perguntas.add("Esteve no local do crime ?");
        perguntas.add("Mora perto da vitima ?");
        perguntas.add("Devia para a vitima ?");
        perguntas.add("Ja trabalhou com a vitima ?");
        
        System.out.println("Responda apenas com << Sim >> ou << Nao >>");
        
        for (int i = 0; i <perguntas.size(); i++) {
            
            System.out.println(perguntas.get(i));
            respostas.add(read.nextLine());
            
            if ("sim".equals(respostas.get(i)) || "Sim".equals(respostas.get(i)) || "SIM".equals(respostas.get(i)) || "S".equals(respostas.get(i)) || "s".equals(respostas.get(i))) {
            
            classi++;
                
        } else if ("nao".equals(respostas.get(i)) || "Não".equals(respostas.get(i)) || "Nao".equals(respostas.get(i)) || "N".equals(respostas.get(i)) || "n".equals(respostas.get(i))) {
            
            classi = classi;
            
        } else {
            
            System.out.println("Erro. Voce so pode responder << sim >> ou << nao >> ");
            i--;
            respostas.remove(i);
            
        }
            
            
        }
        
        if (classi == 2) {
            
            System.out.println("Classificação: << Suspeita >>");
            
        } else if (classi >= 3 && classi <= 4) {
            
            System.out.println("Classificação: << Cumplice >>");
            
        } else if (classi >= 5) {
            
            System.out.println("Classificação: << Assassino >>");
            
        } else {
            
            System.out.println("Classificação: << Inocente >>");
            
        }

    }
    
}
