
public class BinaryOctHex
{
	public static void main(String[] args) {
        int input=Integer.parseInt(args[0]);
        System.out.println("Given number: "+input);
        System.out.println("Binary eqivalent: "+Integer.toBinaryString(input));
        System.out.println("Octal eqivalent: "+Integer.toOctalString(input));
        System.out.println("Hexadecimal eqivalent: "+Integer.toHexString(input));
        
	}
}

