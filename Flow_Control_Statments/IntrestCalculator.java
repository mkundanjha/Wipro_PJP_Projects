
public class IntrestCalculator
{
	public static void main(String[] args) {
	    String gender=args[0];
	    int age=Integer.parseInt(args[1]);
	    
	    if(gender.equals("Female") && (age>0 && age<59)){
	        System.out.println("Intrest Rate= 8.2%");
	        
	    } 
	    if(gender.equals("Female") && (age>=59 && age<=100)){
	        System.out.println("Intrest Rate= 9.2%");
	    } 
	    if(gender.equals("Male") && (age>0 && age<59)){
	        System.out.println("Intrest Rate= 8.4%");
	    }
	    if(gender.equals("Male") && (age>=59 && age<=100)){
	        System.out.println("Intrest Rate= 10.5%");
	    }


 

	}
}

