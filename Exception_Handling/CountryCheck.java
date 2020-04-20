import java.util.Scanner;
class InvalidCountryException extends Exception{
    
}
public class CountryCheck
{
    public static void registerUser(String userName,String userCountry){
        System.out.println("User registration done successfully");
    }
	public static void main(String[] args) {
	    try{
	    Scanner sc=new Scanner(System.in);
	    String name=sc.nextLine();
	    String country=sc.nextLine();
	    
        if (!country.equals("India"))
            throw new InvalidCountryException();
	    registerUser(name,country);
	    }
	    catch(InvalidCountryException e){
	       System.out.println("User Outside India cannot be registred"); 
	    }
	   }
}
