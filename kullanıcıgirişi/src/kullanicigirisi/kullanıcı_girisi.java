package kullanicigirisi;

import java.util.Scanner;

public class kullan�c�_girisi {
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("******************************\n"+
                "Kullan�c� ad� ve parola giri� ekran�na ho� geldiniz...\n"+
                "******************************");
        String sys_kullanici="hilalgltkinn";
        String sys_parola="123456";
        int giris_hakki=3;

        while(true){
            System.out.print("Kullan�c� ad�n�z� giriniz :");
            String kullanici=scan.nextLine();
            System.out.print("Parolan�z� giriniz :");
            String parola=scan.nextLine();
            // not : String==String yapam�yoruz String.equals(String) ile veya !String.equals(String) olarak yapmal�y�z.
            if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)){
                System.out.println("Sisteme ba�ar�l� bir �ekilde giri� yapabildiniz...");
                break;
            }
            else if(kullanici.equals(sys_kullanici) && !parola.equals(sys_parola)){
                if(giris_hakki==0){
                    System.out.println("");
                }
                else{
                    System.out.println("Parolan�z� yanl�� girdiniz l�tfen tekrar deneyiniz...");
                    giris_hakki-=1;
                    System.out.println("giri� hakk�n�z : "+giris_hakki);
                }
            }
            else if(!kullanici.equals(sys_kullanici) && parola.equals(sys_parola)){
                if(giris_hakki==0){
                    System.out.println("");
                }
                else{
                    System.out.println("Kullan�c� ad�n�z� yanl�� girdiniz...");
                    giris_hakki-=1;
                    System.out.println("giri� hakk� : "+giris_hakki);
                }
            }
            else{
                if(giris_hakki==0){
                    System.out.println("");
                }
                else{
                    System.out.println("kullan�c� ad�n�z� ve parolan�z� yanl�� girdiniz l�tfen tekrar deneyiniz...");
                    giris_hakki-=1;
                    System.out.println("giri� hakk�n�z : "+giris_hakki);
                }
            }
            if(giris_hakki==0){
                System.out.println("�zg�n�m giri� hakk�n�z� tamamlad�n�z l�tfen ba�ka bir sefer tekrar deneyiniz");
                break;
            }
        }
    }
}