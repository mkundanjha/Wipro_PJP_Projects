

public class AsciiArray
{
   
	public static void main(String[] args) {
		int arr[]=new int[]{65,66,67,68,69,70,71,72};
		int size=arr.length;
		char value;
	    
	    for(int i=0;i<size;i++){
	        value=(char) arr[i];
	        System.out.print(value+" ");
	    }

	    
	}
}

