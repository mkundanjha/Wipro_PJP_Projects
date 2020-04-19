class Bird extends Animal{
    String name;
    
    Bird(String name){
        super(name);
    }
    public void eat(){
        super.eat();
        }
    public void sleep(){
        super.sleep();
    }
    public void fly(){
        System.out.println(super.name+" fly");
    }
    
}
