
public class ColourCode
{
	public static void main(String[] args) {
	    char input='h';
	    
	    

	    if(Character.compare(input,'R')==0){
	        System.out.print("Red");
	        }
	   else if(Character.compare(input,'B')==0){
	        System.out.print("Blue");
	        }
	   else if(Character.compare(input,'G')==0){
	        System.out.print("Green");
	        }
	   else if(Character.compare(input,'O')==0){
	        System.out.print("Orange");
	        }
	   else if(Character.compare(input,'Y')==0){
	        System.out.print("Yellow");
	        }
	   else if(Character.compare(input,'W')==0){
	        System.out.print("White");
	        }
	   else {
	        System.out.print("Invalid Code");
	        }
	  
}
}
