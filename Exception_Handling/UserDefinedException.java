import java.util.Scanner;
    class NegativeValueException extends Exception{

    }
    class OutOfRangeException extends Exception{

    }

public class UserDefinedException
{


	public static void main(String[] args) {
        try{
        String name1;
        String name2;
        int input,sum1=0,sum2=0;
    
        int marks1[]=new int[10];
        int marks2[]=new int[10];
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter name first of student");
        name1=sc.nextLine();
        
        System.out.println("Enter marks of first student in 3 subjects");
        for(int i=0;i<3;i++){
            input=Integer.parseInt(sc.nextLine());
            if(input<0 || input>100){
                throw new OutOfRangeException();
            }
            if(input<0){
                throw new NegativeValueException();
            }
            marks1[i]=input;
        }
        
        System.out.println("Enter name second of student");
        name2=sc.nextLine();
        
        System.out.println("Enter marks of second student in 3 subjects");
        for(int i=0;i<3;i++){
            input=Integer.parseInt(sc.nextLine());
            if(input<0 || input>100){
                throw new OutOfRangeException();
            }
            if(input<0){
                throw new NegativeValueException();
            }
            marks2[i]=input;
            
        }
            
        for(int i=0;i<3;i++){
            sum1=sum1+marks1[i];
            sum2=sum2+marks2[i];
        }
        System.out.println("Average of First= "+sum1/3);
        System.out.println("Average of Second= "+sum2/3);
        }catch(NumberFormatException e){
            System.out.println("Input format is wrong");
        }catch(NegativeValueException e){
            System.out.println("Don't enter negative number");
        }catch(OutOfRangeException e){
            System.out.println("The number entred should be less than 100 and greater than 0");
        }
        
        
        
	   }
}
