class Teacher extends Person{
    double salary;
    String subject;
    Teacher(String name,String dateOfBirth,double salary,String subject){
        super(name,dateOfBirth);
        this.salary=salary;
        this.subject=subject;
    }
    
    public String getName(){
        return super.getName();
    }
    
    public String getDOB(){
        return super.getDOB();
    }
    public double getSalary(){
        return salary;
    }
    public String getSubject(){
        return subject;
    }
}
