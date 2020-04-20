
class AgeException extends Exception{

    }


public class AgeCheck
{


	public static void main(String[] args) {
        try{
            String name=args[0];
            int age=Integer.parseInt(args[1]);
            
            if(age<18 || age>=60)
                throw new AgeException();
            
            System.out.println("Name= "+name+" Age= "+age);
            
        }catch(AgeException e){
            System.out.println("Your age is invalid");
        }
     
        
        
        
	   }
}
