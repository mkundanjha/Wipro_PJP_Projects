public class Main
{
	public static void main(String[] args) {
		
        
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();
        
        c.draw();
        t.draw();
        s.draw();
        s.erase();
        t.erase();
        c.erase();
	    
		
	}
}

