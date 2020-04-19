import java.util.Scanner; 

public class NCopies
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    char c1=input.charAt(0);
	    char c2=input.charAt(1);
	    String conct=""+c1+c2;
		
		
		for(int i=0;i<input.length();i++){
		    System.out.print(conct);
		}
		
	}
}

