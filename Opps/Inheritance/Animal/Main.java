public class Main
{
	public static void main(String[] args) {
    Animal animal=new Animal("Dog");
    Bird bird=new Bird("Parrot");
    animal.sleep();
    animal.eat();
    bird.sleep();
    bird.eat();
    bird.fly();
	}
}

