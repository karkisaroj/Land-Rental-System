//creating a child class named Tutor that is inheritated of parent class Teacher
public class Tutor extends Teacher//using extends keyword to inheritate the parent class
{
    //initializing attributes and using private access modifier
    private double salary;
    private String specialization;
    private String academic_qualifications;
    private int performanceindex;
    private boolean isCertified;
    //creating a parametarized contructor 
    public Tutor(int teacher_id,String teacher_name,String address,String working_type,String employment_status,int working_hours,int salary,String specialization,String academic_qualifications,int performanceindex){
        //calling the superclass constructor 
        super( teacher_id,teacher_name,address,working_type,employment_status);
        //setting the working hours using superclass method
        super.setworking_hours(working_hours);
        this.salary=salary;
        this.specialization=specialization;
        this.academic_qualifications=academic_qualifications;
        this.performanceindex=performanceindex;
        this.isCertified=false;//initialalizing the value of isCertified to false
    }
    //creating getter method 
    public double getsalary(){
        return this.salary;
    }
    public String getspecialization(){
        return this.specialization;
    }
    public String getacademic_qualifications(){
        return this.academic_qualifications;
    }
    public int getperformanceindex(){
        return this.performanceindex;
    }
    public boolean getisCertified(){
        return this.isCertified;
    }
    //creating setter method to set salary for the tutor class
    public double setSalary(double Salary){
        return this.salary=salary;
    }
    //creating a new method  to calculate salary 
    public void newmethod(double newsalary,int newperformanceindex){
        if(performanceindex>5 && getworking_hours()>20){
            if(performanceindex>5 && performanceindex<=7){
                this.salary=salary+0.05*salary;
            }
            else if(performanceindex>=8 && performanceindex<=9){
                this.salary=salary+0.01*salary;
        }
        else if(performanceindex==10){
            this.salary=salary+0.2*salary;
        }
        this.isCertified=true;
    }
    else{
        System.out.println("the salary cannot be approved");
    }
} 
//creating new method as removetutor which removes the tutor
public void removeTutor(){
    if(isCertified==false){
        this.salary=0;
        this.specialization=null;
        this.academic_qualifications=null;
        this.performanceindex=0;
        this.isCertified=false;
    }
}
//using the same signature value as of parent class to tutor class and displaying the value
public void display(){
    if(this.isCertified=false){
         super.display();   
    }
    else{
        super.display();
        System.out.println("salary is : Rs"+salary);
        System.out.println("specialization : " + specialization);
        System.out.println("academic_qualifications: " +academic_qualifications);
        System.out.println("performanceindex: " +performanceindex);
    }
}
}
