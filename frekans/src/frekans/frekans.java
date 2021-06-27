package frekans;

public class frekans {

	public static void main(String[] args) {
		
		  
		 int [] arr = new int [] {30, 60, 90, 10, 80, 90, 5, 0};  
	        
	        int [] fr = new int [arr.length];  
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
	   
	        System.out.println("---------------------------------------");  
	        System.out.println(" dizinin elamaný | tekrar sayýsý");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
	        }  
	        System.out.println("----------------------------------------");  
	    }} 
