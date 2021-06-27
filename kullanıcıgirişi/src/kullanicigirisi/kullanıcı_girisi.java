package kullanicigirisi;

import java.util.Scanner;

public class kullanýcý_girisi {
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("******************************\n"+
                "Kullanýcý adý ve parola giriþ ekranýna hoþ geldiniz...\n"+
                "******************************");
        String sys_kullanici="hilalgltkinn";
        String sys_parola="123456";
        int giris_hakki=3;

        while(true){
            System.out.print("Kullanýcý adýnýzý giriniz :");
            String kullanici=scan.nextLine();
            System.out.print("Parolanýzý giriniz :");
            String parola=scan.nextLine();
            // not : String==String yapamýyoruz String.equals(String) ile veya !String.equals(String) olarak yapmalýyýz.
            if (kullanici.equals(sys_kullanici) && parola.equals(sys_parola)){
                System.out.println("Sisteme baþarýlý bir þekilde giriþ yapabildiniz...");
                break;
            }
            else if(kullanici.equals(sys_kullanici) && !parola.equals(sys_parola)){
                if(giris_hakki==0){
                    System.out.println("");
                }
                else{
                    System.out.println("Parolanýzý yanlýþ girdiniz lütfen tekrar deneyiniz...");
                    giris_hakki-=1;
                    System.out.println("giriþ hakkýnýz : "+giris_hakki);
                }
            }
            else if(!kullanici.equals(sys_kullanici) && parola.equals(sys_parola)){
                if(giris_hakki==0){
                    System.out.println("");
                }
                else{
                    System.out.println("Kullanýcý adýnýzý yanlýþ girdiniz...");
                    giris_hakki-=1;
                    System.out.println("giriþ hakký : "+giris_hakki);
                }
            }
            else{
                if(giris_hakki==0){
                    System.out.println("");
                }
                else{
                    System.out.println("kullanýcý adýnýzý ve parolanýzý yanlýþ girdiniz lütfen tekrar deneyiniz...");
                    giris_hakki-=1;
                    System.out.println("giriþ hakkýnýz : "+giris_hakki);
                }
            }
            if(giris_hakki==0){
                System.out.println("Üzgünüm giriþ hakkýnýzý tamamladýnýz lütfen baþka bir sefer tekrar deneyiniz");
                break;
            }
        }
    }
}