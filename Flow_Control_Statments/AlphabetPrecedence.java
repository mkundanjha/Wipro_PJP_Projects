
public class AlphabetPrecedence
{
	public static void main(String[] args) {
	    char input1='z';
	    char input2='b';
	    int i1=(int) input1;
	    int i2=(int) input2;
	    if(i1<i2){
	        System.out.print(input1+",");
	        System.out.print(input2);
	    }else{
	        System.out.print(input2+",");
	        System.out.print(input1);
	    }
	    

	}
}

