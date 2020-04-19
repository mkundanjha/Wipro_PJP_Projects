import java.util.Scanner; 

public class BeforeAfreString
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    String input2=scanner.nextLine();
	    String conct="";
	    
	    int count=0,fromIndex=0;
	    
        int size=input2.length();
        
        while((fromIndex = input.indexOf(input2, fromIndex)) != -1 ){
            if(fromIndex-1>-1)
                conct=""+conct+input.charAt(fromIndex-1);
         
                
            if(fromIndex+size<input.length())
                conct=""+conct+input.charAt(fromIndex+size);
        
            
            count++;
            fromIndex++;
            
        }
        
        System.out.println(conct);

       
	}
}

