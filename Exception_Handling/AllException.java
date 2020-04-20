import java.util.Scanner;

public class AllException
{
	public static void main(String[] args) {
	    try{
	    int inp1,inp2,inp3,inp4,inp5;
	    inp1=Integer.parseInt(args[0]);
	    inp2=Integer.parseInt(args[1]);
	    inp3=Integer.parseInt(args[2]);
	    inp4=Integer.parseInt(args[3]);
	    inp5=Integer.parseInt(args[4]);
	    int sum=0;
	    
	    int arr[]=new int[]{inp1,inp2,inp3,inp4,inp5};
	    
	    for(int i=0;i<arr.length;i++)
	        sum=sum+arr[i];
	    
	    System.out.println("Sum= "+sum+" Average= "+sum/arr.length);
	    
        	  

	      
	       
	   } catch(ArithmeticException e) {
	        System.out.println("Please check the arithematic operation");
	        
	   }catch(NumberFormatException e){
	        System.out.println("Please enter value of integer type");
	       
	   }catch(ArrayIndexOutOfBoundsException e){
	       System.out.println("Please enter 5 values for array");
	   } 
        
	}
}
