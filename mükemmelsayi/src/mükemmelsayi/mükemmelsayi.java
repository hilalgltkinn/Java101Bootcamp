package m�kemmelsayi;
 
import java.util.Scanner;
 
public class m�kemmelsayi {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " M�kemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " M�kemmel bir sayi degildir.");
        }
    }
}