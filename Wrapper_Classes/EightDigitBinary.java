import java.util.Scanner;

public class EightDigitBinary
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=Integer.parseInt(sc.nextLine());
        String output=(String) Integer.toBinaryString(input);
        int diffLength=8-output.length();
        String extraString="";
        
        
        if(diffLength!=0){
            for (int i=0;i<diffLength;i++ )
            extraString=""+extraString+"0";
        }
        
        output=extraString+output;
        System.out.println(output);
	}
}

