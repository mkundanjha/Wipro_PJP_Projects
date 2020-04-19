import java.util.Scanner; 

public class StringTrim
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    
	    String conct="";
		
		
		for(int i=1;i<(input.length()-1);i++){
		    conct=""+conct+input.charAt(i);
		}
		System.out.println(conct);
	
	}
}

