package antras;

public class Antras {

   public static void main(String[] args) {

       int [] masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
       //surusiuoti didejimo tvarka
       
       int n = masyvas.length;
       int temp = 0;
       for (int i = 0; i < n; i++) 
           for (int j = 1; j < (n-i); j++) {
               if(masyvas[j-1] > masyvas[j]){
                   //swap elements
                   temp = masyvas[j-1];
                   masyvas[j-1] = masyvas[j];
                   masyvas[j] = temp;
               }
           }
       
       for (int i = 0; i < masyvas.length; i++) { //atspausdina visus elementus
         System.out.print(masyvas[i] + " ");  
       }
       System.out.println("");
       
       //surusiuoti maziejimo tvarka
       
       
       int tempo = 0;
       for (int i = 0; i < n; i++) 
           for (int j = 1; j < (n-i); j++) {
               if(masyvas[j-1] < masyvas[j]){
                   //swap elements
                   tempo = masyvas[j-1];
                   masyvas[j-1] = masyvas[j];
                   masyvas[j] = tempo;
               }
           }
       
       for (int i = 0; i < masyvas.length; i++) { //atspausdina visus elementus
         System.out.print(masyvas[i] + " ");  
       }
    }
    
}
