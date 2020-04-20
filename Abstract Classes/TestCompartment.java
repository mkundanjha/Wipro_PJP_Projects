import java.util.Random; 
abstract class Compartment{
    public abstract String notice();
}

class FirsClass extends Compartment{
    public String notice(){
        return "Only FirsClass passengers allowed";
    }    
}
class Ladies extends Compartment{
    public String notice(){
        return "Only Lady passengers allowed";
    }
}
class General extends Compartment{
    public String notice(){
        return "All passengers allowed";
    }
    
}
class Luggage extends Compartment{
    public String notice(){
        return "Only for Luggage";
    }
}


public class TestCompartment
{
	public static void main(String[] args) {
	    int k=0;
	    Random rand = new Random();
	    
	    int num=rand.nextInt(4)+1;
        Compartment[] c=new Compartment[10];
        
        if(num==1)
            c[k]=new FirsClass();
        if(num==2)
            c[k]=new Ladies();
        if(num==3)
            c[k]=new General();
        if(num==4)
            c[k]=new Luggage();
        
        System.out.println(c[k].notice());
}
}
