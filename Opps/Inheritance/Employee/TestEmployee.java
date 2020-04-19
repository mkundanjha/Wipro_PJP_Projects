public class TestEmployee
{
	public static void main(String[] args) {
    Person person =new Person("Ram");
    Employee employee=new Employee("Laxman",72000,2019,"BC123");
    System.out.println(employee.getName()+" "+employee.getSalary()+" "
    +employee.getYear()+" "+employee.getInsurance());
	}
}

