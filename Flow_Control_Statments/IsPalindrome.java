public class IsPalindrome
{

	public static void main(String[] args) {
	    int num=12321;
	    int digit,rev=0;
	    int temp=num;
	    while(num!=0){
	        digit=num%10;
	        rev=rev*10+digit;
	        num=num/10;
	    }
	    if (temp==rev)
	        System.out.println(temp+" is a palindrome");
	   else
	        System.out.println(temp+" is not a palindrome");

	    
	    
	}
}

