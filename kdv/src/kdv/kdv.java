package kdv;

import java.util.Scanner;


public class kdv {
    public static void main(String[]args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("�cret Tutar�n� Giriniz:");
        tutar=input.nextDouble();

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println ("KDV Oran�"+ kdvOran);
        System.out.println ("KDV Tutar� :"+ kdvTutar);
        System.out.println("KDV'li Tutar�:" + kdvliTutar);
    }
}

