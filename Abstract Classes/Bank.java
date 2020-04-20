abstract class GeneralBank{
    public abstract double getSavingsIntrestRate();
    public abstract double getFixedDepositIntrestRate();
}
class ICICIBank extends GeneralBank{
    public double getSavingsIntrestRate(){
        return 4;
    }
    public double getFixedDepositIntrestRate(){
        return 8.5;
    }
}
class KotMBank extends GeneralBank{
    public double getSavingsIntrestRate(){
        return 6;
    }
    public double getFixedDepositIntrestRate(){
        return 9;
    }
    
}

public class Bank
{
	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		
		System.out.println(i.getSavingsIntrestRate()+" "+i.getFixedDepositIntrestRate());
		System.out.println(k.getSavingsIntrestRate()+" "+k.getFixedDepositIntrestRate());
		GeneralBank g=new KotMBank();
		
		System.out.println(g.getSavingsIntrestRate()+" "+g.getFixedDepositIntrestRate());
		
		GeneralBank gi =new ICICIBank();
		System.out.println(gi.getSavingsIntrestRate()+" "+gi.getFixedDepositIntrestRate());
	}
}

