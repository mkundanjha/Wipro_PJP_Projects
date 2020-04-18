
public class AsciiCheck
{
	public static void main(String[] args) {
	    char input='9';
	    
	    int i=(int) input;
	    
	    if((i>=65 && i<=90) || (i>=97 && i<=122)){
	        System.out.print("Alphabhet");
	        
	    }else if(i>=48 && i<=57){
	        System.out.print("Digit");
	    }else 
	        System.out.print("Special Character");

	}
}

