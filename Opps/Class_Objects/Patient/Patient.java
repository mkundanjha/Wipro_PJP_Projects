public class Patient{
    String patientName;
    double height;
    double weight;
    
    Patient(String patientName,double height,double weight){
        this.patientName=patientName;
        this.height=height;
        this.weight=weight;
    }
    
    public double computeBMI(){
        double bmi=weight/(height*height);
        return bmi;
    }
    
    
}

