
public class IntegerCheck
{
	public static void main(String[] args) {
	    int num1=Integer.parseInt(args[0]);
	    if (num1<0){
	        System.out.println("Negative Number");
	        }
	        else if(num1>0){
	            System.out.println("Positive Number");
	        }else{
	            System.out.println("Zero");
	        }

	}
}

