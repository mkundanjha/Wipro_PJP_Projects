
public class UpperLowerCase
{
	public static void main(String[] args) {
	    char input='Z';
	    
	    int i=(int) input;
	    
	    if(i>=65 && i<=90){
	        System.out.print(input+"-> "+(char)(input+32));
	        
	    }
	    if (i>=97 && i<=122)
	    System.out.print(input+"-> "+(char)(input-32));
}
}
