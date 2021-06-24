package fibonacci;
import java.util.Scanner;
public class fibonacci {

/**
* @www.burakkutbay.com
*/
public static void main(String[] args) {
System.out.println("Kaçýncý Elemana Kadar Gösterilsin");
Scanner oku=new Scanner(System.in);
int limit=oku.nextInt();
int[] fibonacci = new int [limit];
fibonacci[0] = 1;
fibonacci[1] = 1;
for ( int i = 0; i < limit-2; i++ )
{
fibonacci[i+2] = fibonacci[i] + fibonacci[i+1];
}
for ( int i = 0; i < limit; i++ )
{
System.out.println( (i+1) + ". eleman : " + fibonacci[i] );
}
}
}