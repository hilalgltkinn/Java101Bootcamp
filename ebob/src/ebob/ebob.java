package ebob;

public class ebob {

		  
	    public static void main(String[] args) {
	        int n1 = 81, n2 = 90, ebob = 1;
	 
	        for(int i = 1; i <= n1 && i <= n2; ++i)
	        {
	            if(n1 % i==0 && n2 % i==0)
	                ebob = i;
	        }
	 
	        System.out.printf("%d ve %d sayýlarýnýn EBOB'u %d", n1, n2, ebob); 
	    } 
	}


