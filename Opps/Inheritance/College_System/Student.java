class Student extends Person{
    String studentId;
    
    Student(String name,String dateOfBirth,String studentId){
        super(name,dateOfBirth);
        this.studentId=studentId;
    }
    
    public String getName(){
        return super.getName();
    }
    public String getDOB(){
        return super.getDOB();
    }
    
    public String getId(){
        return studentId;
    }
    
}
