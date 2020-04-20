import java.util.Random; 
abstract class Instrument{
    public abstract void play();
}

class Piano extends Instrument{
    public void play(){
        System.out.println("Piano is playing tan tan tan");
    }
}
class Flute extends Instrument{
    public void play(){
        System.out.println("Flute is playing toot toot");
    }
}
class Guitar extends Instrument{
    public void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
    
}

public class TestInstrument
{
	public static void main(String[] args) {
        Instrument[] i= new Instrument[10];
        i[0]=new Piano();
        i[1]=new Flute();
        i[2]=new Guitar();
        
        i[0].play();
        i[1].play();
        i[2].play();
        
        for (int j=0;j<i.length ;j++ ){
            if(i[j] instanceof Piano)
                System.out.println("Piano object at "+j);
            if(i[j] instanceof Guitar)
                System.out.println("Guitar object at "+j);
            if(i[j] instanceof Flute)
                System.out.println("Flute object at "+j);
        } 
        
	    
	}
}
