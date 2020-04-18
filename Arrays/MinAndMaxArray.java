import java.util.Arrays; 
  
public class MinAndMaxArray
{
   
	public static void main(String[] args) {
		int arr[]=new int[]{65,66,67,68,69,70,71,72};
		int size=arr.length;
		char value;
	    
	    Arrays.sort(arr);
	    System.out.println("Largest two numbers in array are "+arr[size-1]+" and "+arr[size-2]);
	    System.out.println("Smallest two numbers in array are "+arr[0]+" and "+arr[1]);
	    
	}
}

