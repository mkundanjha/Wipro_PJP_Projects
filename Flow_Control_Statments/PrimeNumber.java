
public class PrimeNumber
{
	public static void main(String[] args) {
	    int num=8;
	    boolean flag=true;
	    for(int i=2;i<num;i++)
	        if(num%i==0){
	            flag=false;
	            break;
	        }
	   
	   if(flag==false){
	       System.out.println("Not Prime Number");
	   }else
	        System.out.println("Prime Number");

	    
        
	  
}
}
