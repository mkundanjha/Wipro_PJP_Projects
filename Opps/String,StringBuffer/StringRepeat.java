import java.util.Scanner; 

public class StringRepeat
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    
	    int n=Integer.parseInt(scanner.nextLine());
	    
	    String conct="";
		

        
        for(int i=input.length()-n;i<input.length();i++){
            conct=""+conct+input.charAt(i);
        }
	    for(int i=0;i<n;i++){
	        System.out.print(conct);
	    }

        
       
	}
}

