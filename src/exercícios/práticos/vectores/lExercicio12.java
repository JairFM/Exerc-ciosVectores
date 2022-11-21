package exercícios.práticos.vectores;
public class lExercicio12 {


    public static void main(String[] args) {
        
       int countaluno = 0;
       int [] idade = new int[30];
       float [] altura = new float[30];
       float mediaaltura = 0;
       
       
       idade [0] = 12; 
       idade [1] = 13; 
       idade [2] = 16; 
       idade [3] = 15; 
       idade [4] = 15; 
       idade [5] = 12; 
       idade [6] = 12; 
       idade [8] = 11; 
       idade [9] = 13; 
       idade [10] = 18; 
       idade [11] = 20; 
       idade [12] = 14; 
       idade [13] = 14; 
       idade [14] = 15; 
       idade [15] = 14; 
       idade [16] = 12; 
       idade [17] = 11; 
       idade [18] = 12; 
       idade [19] = 12; 
       idade [20] = 12; 
       idade [21] = 13; 
       idade [22] = 15; 
       idade [23] = 19; 
       idade [24] = 17; 
       idade [25] = 14; 
       idade [26] = 12; 
       idade [27] = 12; 
       idade [28] = 11; 
       idade [29] = 13; 
       
       altura [0] = (float) 1.50;
       altura[1] = (float) 1.63;
       altura[2] = (float) 1.52;
       altura[3] = (float) 1.65;
       altura[4] = (float) 1.70;
       altura[5] = (float) 1.76;
       altura[6] = (float) 1.61;
       altura[7] = (float) 1.64;
       altura[8] = (float) 1.59;
       altura[9] = (float) 1.50;
       altura[10] = (float) 1.80;
       altura[11] = (float) 1.67;
       altura[12] = (float) 1.73;
       altura[13] = (float) 1.71;
       altura[14] = (float) 1.81;
       altura[15] = (float) 1.83;
       altura[16] = (float) 1.54;
       altura[17] = (float) 1.59;
       altura[18] = (float) 1.86;
       altura[19] = (float) 1.66;
       altura[20] = (float) 1.77;
       altura[21] = (float) 1.54;
       altura[22] = (float) 1.81;
       altura[23] = (float) 1.81;
       altura[24] = (float) 1.70;
       altura[25] = (float) 1.72;
       altura[26] = (float) 1.65;
       altura[27] = (float) 1.63;
       altura[28] = (float) 1.61;
       altura[29] = (float) 1.78;
       
       for (int i = 0; i < 30; i++) {
           
           mediaaltura = mediaaltura + altura[i];
           
       }
       
            mediaaltura = mediaaltura/30;
       
        for (int i = 0; i < 30; i++) {
           
           if (idade[i] >= 13) {
               
               if (altura[i] <= mediaaltura) {
                   
                   countaluno++;
                   
               }
               
           }
           
       }
        
        System.out.println("Alunos acima de 13 anos com a altura inferior a media --> " + countaluno);
       
       
      

    }
    
}
