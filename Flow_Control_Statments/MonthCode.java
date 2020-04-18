
public class MonthCode
{
	public static void main(String[] args) {
	    
	    
    if(args.length>0){
        int input=Integer.parseInt(args[0]);
	    
	    if(input==1){
	        System.out.print("Janurary");
	        }
	   else if(input==2){
	        System.out.print("February");
	        }
	   else if(input==3){
	        System.out.print("March");
	        }
	   else if(input==4){
	        System.out.print("April");
	        }
	   else if(input==5){
	        System.out.print("May");
	        }
	   else if(input==6){
	        System.out.print("June");
	        }
	   else if(input==7){
	        System.out.print("July");
	        }
	   else if(input==8){
	        System.out.print("August");
	        }
	   else if(input==9){
	        System.out.print("September");
	        }
	   else if(input==10){
	        System.out.print("October");
	        }
 	   else if(input==11){
	        System.out.print("November");
	        }
	   else if(input==12){
	        System.out.print("December");
	        }
	   else {
	        System.out.print("Invalid month");
	        }
        
    }else{
       System.out.print("Please enter the month in numbers");  
    }
	   
	  
}
}
