

public class MaxMinArray
{
    public static int maxValue(int arr[]){
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        
        return max;
        
    }
    public static int minValue(int arr[]){
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        
        return min;
        
    }
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int size=arr.length;
	
		System.out.println("Max= "+maxValue(arr));
		System.out.println("Min= "+minValue(arr));

	}
}

