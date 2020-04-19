public class Main
{
	public static void main(String[] args) {
		Fruit fruit=new Fruit();
		Fruit apple=new Apple();
		Fruit orange=new Orange();
		
		
		fruit.setName("Banana");
		fruit.setTaste("Sweet");
		apple.setTaste("Sweet");
		orange.setTaste("Sour");
		
		fruit.eat();
	    	apple.eat();
	    	orange.eat();
	    
		
	}
}
