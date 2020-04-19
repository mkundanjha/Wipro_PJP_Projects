import java.util.Scanner; 

public class HalfString
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    
	    String conct="";
		
		if((input.length())%2==0){
		for(int i=0;i<(input.length())/2;i++){
		    conct=""+conct+input.charAt(i);
		}
		System.out.println(conct);
		}
		else{
		    System.out.println("null");
		}
		
	}
}

