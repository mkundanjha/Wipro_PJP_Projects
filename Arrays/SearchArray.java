

public class SearchArray
{
   
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int size=arr.length;
		int search=99;
		boolean flag=false;
		int i;
	    
	    for(i=0;i<size;i++){
	        if(search==arr[i]){
	            flag=true;
	            break;
	        }
	        
	    }
	    if(flag)
	        System.out.println(i);
	   else
	        System.out.println("-1");
	    
	}
}

