import java.util.Scanner; 

public class RemoveStar
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    int index=0;
	    String conct="";
		
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='*'){
                index=i;
                break;
            }
        }
        
        for(int i=0;i<index;i++){
            conct=""+conct+input.charAt(i);
        }
	    
	    for(int i=index+1;i<input.length();i++){
            conct=""+conct+input.charAt(i);
        }
        
        System.out.println(conct);
	}
}

