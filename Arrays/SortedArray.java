import java.util.Arrays; 
  
public class SortedArray
{
   
	public static void main(String[] args) {
		int arr[]=new int[]{65,66,67,68,69,70,71,72};
		int size=arr.length;
		char value;
	    
	    Arrays.sort(arr);
	    for(int i=0;i<size;i++)
	        System.out.println(arr[i]);
	    
	}
}

