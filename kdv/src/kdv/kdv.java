package kdv;

import java.util.Scanner;


public class kdv {
    public static void main(String[]args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarýný Giriniz:");
        tutar=input.nextDouble();

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println ("KDV Oraný"+ kdvOran);
        System.out.println ("KDV Tutarý :"+ kdvTutar);
        System.out.println("KDV'li Tutarý:" + kdvliTutar);
    }
}

