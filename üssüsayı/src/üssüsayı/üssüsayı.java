package üssüsayý;

public class üssüsayý {
  
    public static void main(String[] args) {
        int taban = 5, kuvvet = 4;
 
        long sonuc = 1;
 
        while (kuvvet != 0)
        {
            sonuc *= taban;
            --kuvvet;
        }
 
        System.out.println("CEVAP = " + sonuc);
    }
}