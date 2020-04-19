public class Fruit{
    String name;
    String taste;
    String size;
    
  
    
    public void setName(String name){
        this.name=name;
    }
    public void setTaste(String taste){
        this.taste=taste;
    }
    
    public void eat(){
        System.out.println(name+" is "+taste+ " in taste");
    }
    public void eat(String name){
	System.out.println(name+" is "+taste+ " in taste");
    }

}






