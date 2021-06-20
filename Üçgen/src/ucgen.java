import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int a, b, c, cevre;
        double u, alanKare, alan;

        System.out.print("A kenarýný giriniz: ");
        a = girdi.nextInt();
        System.out.print("B kenarýný giriniz: ");
        b = girdi.nextInt();
        System.out.print("C kenarýný giriniz: ");
        c = girdi.nextInt();

        cevre = (a + b + c);
        u = (a + b + c) / 2;
        alanKare = u * (u - a) * (u - b) * (u - c);
        alan = Math.sqrt(alanKare);

        System.out.println("Üçgenin Alaný = " + alan);
    }


}
