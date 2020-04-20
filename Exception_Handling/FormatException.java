import java.util.Scanner;

public class FormatException
{
	public static void main(String[] args) {
	    
	  
	   
	   try {
	        Scanner sc=new Scanner(System.in);
	        int input=Integer.parseInt(sc.nextLine());
	        System.out.println("The square is "+input*input);
	       
	   } catch(NumberFormatException e) {
	        System.out.println("Entered input is not a valid format for an integer.");
	        
	   }
        
	}
}
