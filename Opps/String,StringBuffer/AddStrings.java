import java.util.Scanner; 

public class AddStrings
{

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    String input=scanner.nextLine();
	    String input2=scanner.nextLine();
	    
	   String conct="";
	   int shortSize=0,longSize=0,remainSize=0;
	   
	   if(input.length()>input2.length()){
	       shortSize=input2.length();
	       longSize=input.length();
	   }else{
	       longSize=input2.length();
	       shortSize=input.length();
	   }
	   remainSize=longSize-shortSize;
		
        
        
        for(int i=0;i<shortSize;i++){
            conct=""+conct+input.charAt(i)+input2.charAt(i);
        }
        
        if(remainSize!=0){
            if(input.length()>input2.length()){
                for(int i=shortSize;i<longSize;i++){
                     conct=""+conct+input.charAt(i);
                }}else{
                    for(int i=shortSize;i<longSize;i++){
                     conct=""+conct+input2.charAt(i);
                }
            }
        }
        
        System.out.print(conct);

        
       
	}
}

