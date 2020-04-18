
public class SumBetweenNumbers
{
   
	public static void main(String[] args) {
		int arr[]=new int[]{10,3,6,1,2,7,9};
		int size=arr.length;
		int sum1=0,sum2=0,k=0;
		
		for(int i=0;i<size;i++){
		    sum1=sum1+arr[i];
		}
		
	    
	    
	    for(int i=0;i<size;i++){
	        if(arr[i]==6 && (i+1)<size){
	            while(arr[i+k]!=7){
	                sum2=sum2+arr[i+k];
	                k++;
	            }
	            sum2+=7;
	            break;
	        }
	    }
	    
	    
	    
	        System.out.println(sum1-sum2);
	    
	}
}

