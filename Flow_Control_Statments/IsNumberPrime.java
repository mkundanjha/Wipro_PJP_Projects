
public class IsNumberPrime
{
    
    public static boolean isPrime(int num){
         
         for(int i=2;i<num;i++)
	        if(num%i==0){
	            return false;
	            }
	       
	   return true;
    }
    
	public static void main(String[] args) {
	    if (args.length>0){
	    int num=Integer.parseInt(args[0]);
	   
	    if(num>1){
	        if(isPrime(num))
	            System.out.println(num+" is a prime number");
	        else
	            System.out.println(num+" is not a prime number");
	        
	    }else{
	        System.out.println(num+" is neither a prime nor a composite ");
	    }
	    }else
	        System.out.println("Please enter an integer number");
	    
	}	  
}

