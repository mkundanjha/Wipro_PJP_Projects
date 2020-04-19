class Employee extends Person{
    double annualSalary;
    int workYear;
    String insuranceNo;
    
    Employee(String name,double annualSalary,int workYear,String insuranceNo){
        super(name);
        this.annualSalary=annualSalary;
        this.workYear=workYear;
        this.insuranceNo=insuranceNo;
    }
    public String getName(){
        return super.getName();
    }
    public double getSalary(){
        return annualSalary;
    }
    public int getYear(){
        return workYear;
    }
    public String getInsurance(){
        return insuranceNo;
    }
    
}
