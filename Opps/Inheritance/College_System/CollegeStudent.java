class CollegeStudent extends Student{
    String collegeName;
    String yearOfStudy;
    
    CollegeStudent(String name,String dateOfBirth,String studentId,String collegeName,String yearOfStudy){
        super(name,dateOfBirth,studentId);
        this.collegeName=collegeName;
        this.yearOfStudy=yearOfStudy;
    }
    
        
    public String getName(){
        return super.getName();
    }
    public String getDOB(){
        return super.getDOB();
    }
    
    public String getId(){
        return super.getId();
    }
    public String getcollegeName(){
        return collegeName;
    }
    public String getyearOfStudy(){
        return yearOfStudy;
    }
}
