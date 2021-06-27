package transpoze;
import java.util.Scanner;
public class transpoze{

     public static void main(String[] args) {
         Scanner giris = new Scanner(System.in);
         System.out.println("Matrisin satir sayisini giriniz: ");
         int satir=giris.nextInt();
         System.out.println("Matrisin sutun sayisini giriniz: ");
         int sutun=giris.nextInt();
         System.out.println("Matris elamanlarini giriniz:");
         int[][] matriseleman = new int [satir][sutun];
         int i, j;
         for(i=0;i<satir;i++)
         {
              for(j=0;j<sutun;j++) {
                  
                   matriseleman[i][j]=giris.nextInt();
                   System.out.println((i+1)+","+(j+1)+".eleman: "+ matriseleman[i][j]);
              }
         }

         for(int m=0;m<satir;m++) {
              int satir_toplam=0;
              for(int n =0; n<sutun; n++)
              {
                   satir_toplam+= matriseleman[m][n];
              }
              System.out.println((m+1)+".satir toplami "+satir_toplam);
         }
     }

}

