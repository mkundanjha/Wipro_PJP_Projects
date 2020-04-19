import java.util.Scanner; 

public class XinString
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    
	    String conct="";
		
		if(input.charAt(0)=='x' || input.charAt(input.length()-1)=='x'){
		for(int i=1;i<(input.length()-1);i++){
		    conct=""+conct+input.charAt(i);
		}
		}
		else
		    conct=input;
		System.out.println(conct);
	
	}
}

