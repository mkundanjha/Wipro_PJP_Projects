import java.util.Scanner;

public class ArrayException
{
	public static void main(String[] args) {
	    
	  
	   
	   try {
	      Scanner sc=new Scanner(System.in);
	      
	      
	      
	      System.out.println("Enter the number of elements in the array");
	      int size =Integer.parseInt(sc.nextLine());
	      int array[]=new int[size];
	      
	      
	      int index;
	      
	      System.out.println("Enter the elements in the array");
	      for(int i=0;i<size;i++){
	          int input=Integer.parseInt(sc.nextLine());
	          array[i]=input;
	      }
	      System.out.println("Enter the indexof the array element you want to access");
	      index=Integer.parseInt(sc.nextLine());
	      
	      System.out.println("The array element at index "+index+" = "+array[index]);
	      System.out.println("The array element successfully accessed");
	      
	       
	   } catch(ArrayIndexOutOfBoundsException e) {
	        e.printStackTrace();
	        
	   }
        
	}
}
