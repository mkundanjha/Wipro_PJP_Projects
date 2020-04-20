package music{
    interface Playable{
        void play();
    }
    
    package string{
        class Veena implements Playable{
            void play(){
                System.out.println("Veena plays");
            }
            
        }
    }
    
    package wind{
        class Saxophone implements Playable{
            void play(){
                System.out.println("Saxophone plays");
            }
        }
    }
}

package live{
    import music.string.Veena;
    import music.wind.Saxophone;
    
    class Test{
        Veena v=new Veena();
        v.play();
        
        Saxophone s= new Saxophone();
        s.play();
        
    }
}


public class Main
{
	public static void main(String[] args) {

	}
}
