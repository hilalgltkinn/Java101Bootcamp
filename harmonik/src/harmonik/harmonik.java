package harmonik;

public class harmonik {
public static void main(String[] args) {
        
        double[] dizi = { };
        double toplam = 0.0;
 
        for (double sayi: dizi) {
           toplam += sayi;
        }
 
        double ortalama = toplam / dizi.length;
        System.out.format("Dizinin Ortalamasý: %.2f", ortalama);
        System.out.println();
    }   

}
