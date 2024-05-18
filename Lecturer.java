//Creating a subclass named lecturer which is inheritated from parent class Teacher
public class Lecturer extends Teacher
{
        //initializing attributes and using private access modifier fo lecturer class
        private String Department;
        private int YearsOfExperience;
        private int gradedScore;
        private boolean hasGraded;
        //creating a parametarized contructor    
    public Lecturer(int teacher_id,String teacher_name,String address,String working_type,
    String employment_status,String Department,
    int YearsOfExperience,int working_hours){
        //Calling the superclass constructor Teacher to initialize the parameter value
        super(teacher_id, teacher_name, address, working_type, employment_status);//calling super class constructor 
        super.setworking_hours(working_hours);
        this.Department=Department;
        this.gradedScore=0;
        this.YearsOfExperience=YearsOfExperience;
        this.hasGraded=false;
    }
    //creating getter for lecturer class
    public String getDepartment(){
        return this.Department;
    }
        public int getYearsOfExperience(){
            return this.YearsOfExperience;
    }
        public int getgradedScore(){
            return this.gradedScore;
    }
        public boolean gethasGraded(){
            return this.hasGraded;
    }
    //creating a setter method to set the graded score for the lecturer
    public void setgradedScore(int gradedScore){
        this.gradedScore=gradedScore;
    }
    // Method to grade assignment
    public void gradeAssignment(int gradedScore, String Department, int yearsOfExperience) {
        if (yearsOfExperience >= 5 && this.Department .equals(Department)) {
            if (gradedScore >= 70) {
                System.out.println("The grade is: A");
            } else if (gradedScore >= 60) {
                System.out.println("The grade is: B");
            } else if (gradedScore >= 50) {
                System.out.println("The grade is: C");
            } else if (gradedScore >= 40) {
                System.out.println("The grade is: D");
            } else {
                System.out.println("The grade is: E");
            }
            this.hasGraded = true;
        } else {
            System.out.println("Lecturer has not graded yet");
        }
    }
    //creating a same signature method as method of Teacher class to display the display details of teacher and lecturer 
    public void display(){
        super.display();
        System.out.println("department :" +Department);
        System.out.println("YearsOfExperience:" +YearsOfExperience);
        System.out.println("gradedScore is :" +gradedScore);
            if(hasGraded==true){
        System.out.println("graded score :" +hasGraded);
    }
    else{
        System.out.println("the score has not been graded");
    }
    }

}


