

public class PrimeNumberRange
{
    
    public static boolean isPrime(int num){
         
         for(int i=2;i<num;i++)
	        if(num%i==0){
	            return false;
	            }
	       
	   return true;
    }
    
	public static void main(String[] args) {
	    int num=8;
	    boolean flag=true;
	    for(int i=10;i<=99;i++)
	       if(isPrime(i)){
	           System.out.println(i);
	       }
	        }

	  
}

