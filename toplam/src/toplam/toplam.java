package toplam;

import java.util.Scanner;
 
 
public class toplam {
  
    public static void main(String[] args) {
        // Klavyeden okuma yapmak i�in Scanner nesnesini olu�tur.
        Scanner reader = new Scanner(System.in);
        int num;
        int ctoplam=0,ttoplam=0;
 
        do{
          
        System.out.print("Bir Say� Girin: ");
        num = reader.nextInt();
        
        if(num%2==0)
            ctoplam+=num;
        else
            ttoplam+=num;
  
        }while(num != 0);
 
        System.out.println("Tek Say� Toplam� : " + ttoplam);
        System.out.println("�ift Say� Toplam�: " + ctoplam);
    } 
}