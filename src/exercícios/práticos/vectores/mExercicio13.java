package exercícios.práticos.vectores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class mExercicio13 {


    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        float media = 0;
        List<String> meses = new ArrayList();
        List<Float> temperatura = new ArrayList();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Marco");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");
        
        for (int i = 0; i < meses.size(); i++) {
            
            System.out.println("Insira a media da temperatura, em graus, do mes de " + (meses.get(i)));
            temperatura.add(read.nextFloat());
            media = media + temperatura.get(i);
            
        }
        
        media = media / meses.size();
        
        System.out.printf("Media anual da temperaturas --> %.2fºC\n" , media);
        System.out.println("Temperaturas acima da media anual: ");
                
        
        for (int i = 0; i < meses.size(); i++) {
            
            if (temperatura.get(i) > media) {
                
                System.out.println("" + temperatura.get(i) + "ºC no mes de " + meses.get(i));
                
            }
            
        }
        

    }
    
}
