package kdvödev;


import java.util.Scanner;

class kdvödev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int para;
        double kdv;
        System.out.print("Para Değerini Girin: ");
        para = sc.nextInt();
        if (para >= 0 && para <= 1000) {
            kdv = 0.18;
        }else{
            kdv = 0.08;
        }
        kdv *= para;
        System.out.println("KDV'siz Fiyat = " + para);
        System.out.println("KDV'li Fiyat = " +  (para + kdv));
        System.out.println("KDV Tutarı = " + kdv);

    }
}
