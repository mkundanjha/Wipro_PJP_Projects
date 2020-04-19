public class Main
{
	public static void main(String[] args) {
    Person person =new Person("Ram","24/09/1996");
    Teacher teacher= new Teacher("Jack","22/10/1988",42000,"Maths");
    Student student=new Student("Rock","10/11/1992","123AB");
    CollegeStudent collegeStudent= new CollegeStudent("Laxman","7/02/1999","115DF","MIT","Fourth");
   
    System.out.println(person.getName()+" "+teacher.getName()+" "+student.getName()
    +" "+collegeStudent.getName());
    System.out.println(teacher.getSubject()+" "+teacher.getSalary());
    System.out.println(collegeStudent.getyearOfStudy()+" "+collegeStudent.getId());
	}
}

