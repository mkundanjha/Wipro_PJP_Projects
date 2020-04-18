

public class ArraySumAvg
{
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int size=arr.length;
		int sum=0;
		for(int i=0;i<size;i++){
		    sum=sum+arr[i];
		}
		
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+sum/size);

	}
}

