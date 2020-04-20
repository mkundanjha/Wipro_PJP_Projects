import java.util.Scanner;

public class DivideException
{
    public static double divide(int num1,int num2){
        if(num2<1){
            throw new ArithmeticException();
        }
        
        return num1/num2;
    }	
	public static void main(String[] args) {
	    try{
	    int num1=10;
	    int num2=0;
	    
	    System.out.println(divide(num1,num2));
	    }
	    catch(ArithmeticException e){
	       System.out.println("Divisor is zero or less"); 
	    }
	   }
}
