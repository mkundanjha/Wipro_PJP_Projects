import java.util.Scanner; 

public class StringSize
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    String input2=scanner.nextLine();
	    
	    String shorter,longer;
	    if(input.length()>input2.length()){
	        shorter=input2;
	        longer=input;
	    }else{
	        shorter=input;
	        longer=input2;
	    }
		

		System.out.println(shorter+longer+shorter);
	
	}
}

