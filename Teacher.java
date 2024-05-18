//Creating a class named Teacher to represent information about a teacher
public class Teacher
{
    //initializing attributes and using private access modifier to store teacher details
    private String teacher_name;
    private String address;
    private String working_type;
    private String employment_status;
    private int teacher_id;
    private int working_hours;
    //creating a parametarized contructor to initialize teacher details 
    public Teacher(int teacher_id,String teacher_name,String address,String working_type,String employment_status){
        //Using "this" to refer to the instance variables and set them to the parameter of Teacher constructor
        this.teacher_name=teacher_name;
        this.teacher_id=teacher_id;
        this.address=address;
        this.working_type=working_type;
        this.employment_status=employment_status;
    }
    //creating getter method to retreive the details of teacher
    //get the name of teacher
    public String getTeacher_name(){
        return this.teacher_name;
    }
    //get the address of the teacher
    public String getaddress(){
        return this.address;
    }
    //get the teacher_id of the teacher
    public int getteacher_id(){
        return this.teacher_id;
    }
    //get the working type of the teacher
    public String getworking_type(){
        return this.working_type;
    }
    //get the employment status of the teacher
    public String getemployment_status(){
        return this.teacher_name;
    }
    //get the working hours of the teacher
    public int getworking_hours(){
        return this.working_hours;
    }
    //creating a setter method to set the working hours for the teacher
    public void setworking_hours(int working_hours){
            // Set the working hours attribute with the parameter value
            this.working_hours=working_hours;
    }
    //creating a method to display the details of the teacher
    public void display(){
        System.out.println("the teacher id is "+teacher_id);
        System.out.println("the name of teacher:" +teacher_name);
        System.out.println("address of the teacher is :" +address);
        System.out.println("working type of the teacher is = " +working_type);
        System.out.println("employment status of the teacher is=" +employment_status);
        //checking condition for working hours
        if(working_hours==0){
            System.out.println("working hour is not assigned");
        }
        else{
            System.out.println("working hour is :"+working_hours);
        }
    }//display the details of the teacher
}

