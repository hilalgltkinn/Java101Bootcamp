package v�c�tk�tleindeksi;

import java.util.Scanner;

class v�cutk�tleindeksi {

    public static void main(String[] args) {
        double kilo, boy , sonuc;
        System.out.println("L�tfen boyunuzu giriniz");
        Scanner inp = new Scanner(System.in);
        boy = inp.nextDouble();

        System.out.println("L�tfen  kilonuzu giriniz");
        kilo =inp.nextDouble();

        sonuc = kilo/(boy*boy);
        System.out.println("v�cut kitle indeksini hesapla :" +sonuc); }

}


