import java.util.Scanner;
class DivideByZeroException extends Exception{
    
}
public class DivideByZero
{

	public static void main(String[] args) {
	    try{
	    Scanner sc=new Scanner(System.in);
	    int num1=Integer.parseInt(sc.nextLine());
	    int num2=Integer.parseInt(sc.nextLine());;
	    
	    if(num2==0)
	        throw new DivideByZeroException();
	    
	    System.out.println(num1/num2);
	    }
	    catch(DivideByZeroException e){
	       System.out.println("DivideByZeroException caught"); 
	    }finally{
	        System.out.println("Inside finally block");
	    }
	   }
}
