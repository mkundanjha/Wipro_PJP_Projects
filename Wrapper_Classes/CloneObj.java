class Employee{
    String name;
    double salary;
    Employee(){
        name="Jack";
        salary=10000;
    }
}




public class CloneObj
{
	public static void main(String[] args) {
        
        Employee ob1=new Employee();
        System.out.println(ob1.name+"  "+ob1.salary);
        
        Employee ob2=ob1;
        ob2.name="Ram";
        ob2.salary=20000;
        
        System.out.println(ob1.name+"  "+ob1.salary);
        System.out.println(ob2.name+"  "+ob2.salary);
	}
}

