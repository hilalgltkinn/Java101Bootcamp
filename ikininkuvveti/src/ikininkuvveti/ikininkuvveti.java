package ikininkuvveti;

import java.util.Scanner;

public class ikininkuvveti {

	public static void main(String[] args) {
		
		  try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Sayi gir: ");
	        int sayi = inp.nextInt();
	        for(int i=1;i<=sayi;i++){
	            System.out.print("2'inci katý :"+Math.pow(i, 2));
	            
	            System.out.println("");
	        }
		}
	}
	
}
		  
