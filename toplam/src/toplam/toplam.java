package toplam;

import java.util.Scanner;
 
 
public class toplam {
  
    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluþtur.
        Scanner reader = new Scanner(System.in);
        int num;
        int ctoplam=0,ttoplam=0;
 
        do{
          
        System.out.print("Bir Sayý Girin: ");
        num = reader.nextInt();
        
        if(num%2==0)
            ctoplam+=num;
        else
            ttoplam+=num;
  
        }while(num != 0);
 
        System.out.println("Tek Sayý Toplamý : " + ttoplam);
        System.out.println("Çift Sayý Toplamý: " + ctoplam);
    } 
}