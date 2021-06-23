
	import java.util.Scanner;
	public class tekcift{
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Bir Sayi Giriniz ");
	        int deger= scan.nextInt();
	        if(deger%2 == 1){
	           System.out.println("Girdiginiz Sayi TEK");
	        }else{
	           System.out.println("Girdiginiz Sayi CIFT");
	        }
	    }
	}


