import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Panel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.util.ArrayList;
import java.util.Scanner;



public class TeacherGUI implements ActionListener {
        JFrame frame, lecturerFrame, tutorFrame;
        JPanel tutor_title_panel, lecturer_title_panel;
        JLabel GUI,logo,pic,picture,img;
        JButton home_lecturer, home_tutor;
        JLabel lecturer, nameLabel, workingTypeLabel, gradedScoreLabel, addressLabel, teacherIdLabel, employmentStatusLabel,
        YearsOfExpLecturerLabel,yearsOfExperienceLabel, assignmentLabel, workingHoursLabel, departmentLabel,teacherId_for_grade,department_lecturerLabel;
        JTextField nameField, workingTypeField, gradedScoreField, addressField, teacherIdField, employmentStatusField,
        YearsOfExpLecturerField,yearsOfExperienceField, workingHoursField, departmentField, salaryField, specializationField, academicQualificationsField, performanceIndexField,teacherIdField_for_grade,department_lecturerfield;
        JButton addtolecturerbtn, displaytutor, goToTutorButton, clearButton, goToLecturerButton, gradeAssignmentButton, removeButton, setSalaryButton, addButton,clearBtn,displaylecturer;
        JComboBox workingTypeComboBox;
        ImageIcon images,school,image;
        Color bgcolor1;       
        ArrayList<Teacher>list=new ArrayList<>();
    
    public TeacherGUI() {

        // Creating JFrame with title bar
        frame = new JFrame("Teacher GUI");
        frame.getContentPane().setBackground(new Color(45, 67, 86));//using contentPane as a container for background 
        
        
        school=new ImageIcon("school.jpg");
        picture=new JLabel(school);
        picture.setBounds(180,100,400,100);
        
        frame.add(picture);
        
        // Adding heading for this frame
        GUI = new JLabel("----------CLICK BELOW----------");
        GUI.setBounds(250, 10, 500, 30);
        GUI.setForeground(Color.WHITE);//setting text color to white
        GUI.setFont(new Font("Arial", Font.BOLD, 20));//setting font and using new to instantiate Font

        // Adding buttons
        home_lecturer = new JButton("Lecturer");
        home_lecturer.setBounds(250, 300, 250, 50);
        home_tutor = new JButton("Tutor");
        home_tutor.setBounds(250, 350, 250, 50);
        
 
        // Adding components to frame
        frame.add(home_lecturer);
        frame.add(home_tutor);
        frame.add(GUI);

        // Adding listener
        home_lecturer.addActionListener(this);
        home_tutor.addActionListener(this);

        frame.setLayout(null);
        frame.setSize(800, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }


 public void open_lecturer() {

    // Creating JFrame with Title Bar.
    lecturerFrame = new JFrame("LECTURER");
    lecturerFrame.getContentPane().setBackground(new Color(45, 67, 86));
    images = new ImageIcon("background.png");
    pic = new JLabel(images);
    pic.setBounds(390, 350, 600, 430);
    lecturerFrame.add(pic);

    lecturerFrame.setBounds(450, 200, 200, 50);

    // Creating JLabels
    lecturer = new JLabel("Lecturer");
    lecturer.setFont(new Font("Arial", Font.BOLD, 30));
    lecturer_title_panel = new JPanel();
    lecturer_title_panel.setBounds(0, 0, 1000, 40);
    lecturer_title_panel.setBackground(new Color(180, 180, 184));

    teacherIdLabel = new JLabel("Teacher ID:");
    teacherIdLabel.setForeground(Color.WHITE);

    JLabel teacherId_for_grade = new JLabel("Teacher ID:");
    teacherId_for_grade.setForeground(Color.WHITE);

    nameLabel = new JLabel("Teacher Name:");
    nameLabel.setForeground(Color.WHITE);

    addressLabel = new JLabel("Address:");
    addressLabel.setForeground(Color.WHITE);

    workingTypeLabel = new JLabel("Working Type:");
    workingTypeLabel.setForeground(Color.WHITE);

    gradedScoreLabel = new JLabel("Graded Score:");
    gradedScoreLabel.setForeground(Color.WHITE);

    employmentStatusLabel = new JLabel("Employment Status:");
    employmentStatusLabel.setForeground(Color.WHITE);

    assignmentLabel = new JLabel("Assignment");
    assignmentLabel.setFont(new Font("Arial", Font.BOLD, 30));
    assignmentLabel.setForeground(Color.WHITE);

    yearsOfExperienceLabel = new JLabel("Years Of Experience:");
    yearsOfExperienceLabel.setForeground(Color.WHITE);

    YearsOfExpLecturerLabel = new JLabel("Years Of Experience:");
    YearsOfExpLecturerLabel.setForeground(Color.WHITE);

    workingHoursLabel = new JLabel("Working Hours:");
    workingHoursLabel.setForeground(Color.WHITE);

    departmentLabel = new JLabel("Department:");
    departmentLabel.setForeground(Color.WHITE);

    department_lecturerLabel = new JLabel("Department:");
    department_lecturerLabel.setForeground(Color.WHITE);

    // Creating JTextFields
    teacherIdField = new JTextField();
    JTextField teacherIdField_for_grade = new JTextField();
    nameField = new JTextField();
    addressField = new JTextField();
    gradedScoreField = new JTextField();
    employmentStatusField = new JTextField();
    yearsOfExperienceField = new JTextField();
    departmentField = new JTextField();
    workingHoursField = new JTextField();
    department_lecturerfield = new JTextField();
    YearsOfExpLecturerField = new JTextField();

    // Creating JComboBox for working type
    workingTypeComboBox = new JComboBox();
    workingTypeComboBox.addItem("Full-time");
    workingTypeComboBox.addItem("Part-time");
    workingTypeComboBox.addItem("Contract");
    workingTypeComboBox.addItem("Temporary");

    // Setting size and position of the components
    lecturer.setBounds(450, 10, 500, 30);
    teacherIdLabel.setBounds(50, 50, 100, 30);
    nameLabel.setBounds(50, 100, 100, 30);
    addressField.setBounds(200, 150, 200, 30);
    addressLabel.setBounds(50, 150, 100, 30);
    workingTypeLabel.setBounds(50, 200, 150, 30);
    employmentStatusLabel.setBounds(50, 250, 150, 30);
    teacherId_for_grade.setBounds(450, 100, 150, 30);
    yearsOfExperienceLabel.setBounds(450, 150, 150, 30);
    workingHoursLabel.setBounds(50, 300, 150, 30);
    departmentLabel.setBounds(450, 200, 100, 30);
    gradedScoreLabel.setBounds(450, 250, 100, 30);
    assignmentLabel.setBounds(600, 50, 500, 30);
    department_lecturerLabel.setBounds(50, 350, 150, 30);
    YearsOfExpLecturerLabel.setBounds(50, 400, 150, 30);

    // Adding components to frame
    lecturerFrame.add(lecturer);
    lecturerFrame.add(teacherIdLabel);
    lecturerFrame.add(nameLabel);
    lecturerFrame.add(addressLabel);
    lecturerFrame.add(workingTypeLabel);
    lecturerFrame.add(employmentStatusLabel);
    lecturerFrame.add(gradedScoreLabel);
    lecturerFrame.add(assignmentLabel);
    lecturerFrame.add(yearsOfExperienceLabel);
    lecturerFrame.add(workingHoursLabel);
    lecturerFrame.add(departmentLabel);
    lecturerFrame.add(teacherIdField);
    lecturerFrame.add(nameField);
    lecturerFrame.add(addressField);
    lecturerFrame.add(gradedScoreField);
    lecturerFrame.add(workingTypeComboBox);
    lecturerFrame.add(employmentStatusField);
    lecturerFrame.add(yearsOfExperienceField);
    lecturerFrame.add(workingHoursField);
    lecturerFrame.add(lecturer_title_panel);
    lecturerFrame.add(departmentField);
    lecturerFrame.add(teacherId_for_grade);
    lecturerFrame.add(teacherIdField_for_grade);
    lecturerFrame.add(department_lecturerLabel);
    lecturerFrame.add(department_lecturerfield);
    lecturerFrame.add(YearsOfExpLecturerLabel);
    lecturerFrame.add(YearsOfExpLecturerField);

    // Setting size and positioning JTextFields
    teacherIdField.setBounds(200, 50, 200, 30);
    nameField.setBounds(200, 100, 200, 30);
    workingTypeComboBox.setBounds(200, 200, 200, 30);
    employmentStatusField.setBounds(200, 250, 200, 30);
    teacherIdField_for_grade.setBounds(600, 100, 200, 30);
    yearsOfExperienceField.setBounds(600, 150, 200, 30);
    workingHoursField.setBounds(200, 300, 200, 30);
    departmentField.setBounds(600, 200, 200, 30);
    gradedScoreField.setBounds(600, 250, 200, 30);
    department_lecturerfield.setBounds(200, 350, 200, 30);
    YearsOfExpLecturerField.setBounds(200, 400, 200, 30);

    // Creating and positioning JButtons
    addtolecturerbtn = new JButton("Add a Lecturer");
    addtolecturerbtn.setBounds(50, 500, 150, 70);
    lecturerFrame.add(addtolecturerbtn);

    displaylecturer = new JButton("Display Details");
    displaylecturer.setBounds(250, 500, 150, 70);
    lecturerFrame.add(displaylecturer);

    gradeAssignmentButton = new JButton("Grade Assignment");
    gradeAssignmentButton.setBounds(820, 240, 150, 60);
    lecturerFrame.add(gradeAssignmentButton);

    clearButton = new JButton("Clear");
    clearButton.setBounds(830, 100, 180, 50);
    lecturerFrame.add(clearButton);

    goToTutorButton = new JButton("Go to Tutor");
    goToTutorButton.setBounds(830, 700, 150, 50);
    lecturerFrame.add(goToTutorButton);

    // Adding ActionListener to buttons
    goToTutorButton.addActionListener(this);
    addtolecturerbtn.addActionListener(this);
    gradeAssignmentButton.addActionListener(this);
    goToTutorButton.addActionListener(this);
    clearButton.addActionListener(this);
    displaylecturer.addActionListener(this);
    gradeAssignmentButton.addActionListener(this);

    // Setting JFrame properties
    lecturerFrame.setSize(1000, 800);
    lecturerFrame.setLayout(null); // Set layout to null for manual positioning
    lecturerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lecturerFrame.setResizable(false);
    lecturerFrame.setVisible(true);
}

public void ADDlecturer() {
    // Check if any field is empty
    if (teacherIdField.getText().isEmpty() || nameField.getText().isEmpty() || addressField.getText().isEmpty() ||
        workingTypeComboBox.getSelectedItem() == null || employmentStatusField.getText().isEmpty() || YearsOfExpLecturerField.getText().isEmpty() ||
        workingHoursField.getText().isEmpty()||department_lecturerfield.getText().isEmpty()) {
        // Display warning message if any field is empty
        JOptionPane.showMessageDialog(lecturerFrame, "Please fill in all the fields.", "Warning", JOptionPane.WARNING_MESSAGE);
    } else {
        try {
            // Parsing numeric fields
            int teacher_id = Integer.parseInt(teacherIdField.getText());
            int YearsOfExperience = Integer.parseInt(YearsOfExpLecturerField.getText());
            int workingHours = Integer.parseInt(workingHoursField.getText());
            

            String teacher_name = nameField.getText();
            String address = addressField.getText();
            String working_type = (String) workingTypeComboBox.getSelectedItem();
            String employment_status = employmentStatusField.getText();
            String department = department_lecturerfield.getText();
            
            if(list.isEmpty()){
                // Create Lecturer object and add to the list
                Lecturer lecturer = new Lecturer(teacher_id, teacher_name, address, working_type, employment_status, department, YearsOfExperience, workingHours);
                list.add(lecturer);

                // Display success message
                JOptionPane.showMessageDialog(lecturerFrame, "Lecturer added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);


            }else{
            // Check if teacher ID already exists
            boolean isAdded = true;
            //traversal used for checking each object 
            for (Teacher var : list) {
                if (var instanceof Lecturer && teacher_id == var.getteacher_id()) {
                    isAdded = false;
                    break;
                }
                
            }
            if (isAdded==false) {
                // Create Lecturer object and add to the list
                Lecturer lecturer = new Lecturer(teacher_id, teacher_name, address, working_type, employment_status, department, YearsOfExperience, workingHours);
                list.add(lecturer);
                

                // Display success message
                JOptionPane.showMessageDialog(lecturerFrame, "Lecturer added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);


            } else {
                // Display error message if lecturer with same ID already exists
                JOptionPane.showMessageDialog(lecturerFrame, "Lecturer with this ID already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(lecturerFrame, "Please enter valid data for numeric fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

public void assignmentbutton() {
    if (list.isEmpty()) {
        JOptionPane.showMessageDialog(lecturerFrame, "Please fill all the information of the lecturer to grade", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            int teacher_id = Integer.parseInt(teacherIdField.getText());
            int graded_score = Integer.parseInt(gradedScoreField.getText());
            String Department = departmentField.getText();
            int Years_of_Experience = Integer.parseInt(YearsOfExpLecturerField.getText());

            if (!list.isEmpty()) {
                Lecturer lecturer = null;//Boolean flag //variable lecturer used as a refrence for Lecturer type set to null
                for (Teacher object : list) {
                    // Check if the object in the list is an instance of Lecturer
                    if (object instanceof Lecturer) {
                        if (teacher_id == object.getteacher_id()) {
                            //Downcasts the object to a Lecturer and assigns it to the lecturer variable
                            lecturer = (Lecturer) object;
                            break;
                        }
                    }
                }
                if (lecturer != null) {
                    // Call the gradeAssignment method of the lecturer object
                    lecturer.gradeAssignment(graded_score, Department, Years_of_Experience);
                    
                    // Display the output in a dialog box
                    String message = "Grading complete.\n" +
                                     "Department: " + lecturer.getDepartment() + "\n" +
                                     "Years Of Experience: " + lecturer.getYearsOfExperience() + "\n" ;
                                     
                    
                    JOptionPane.showMessageDialog(lecturerFrame, message, "Grading Result", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    JOptionPane.showMessageDialog(lecturerFrame, "Please enter a valid teacher ID!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(lecturerFrame, "Can't grade when the list is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            JOptionPane.showMessageDialog(lecturerFrame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


public void display_lecturer() {
    if (list.isEmpty()==false) {
        for (Teacher object : list) {
            if (object instanceof Lecturer) {
                Lecturer lecturer = (Lecturer) object;//downcastin
                //object will be treated as Lecturer and assign it to lecturer variable
                //lecturer is variable of type Lecturer
                // Print details 
                String message = "***************************************INFORMATION************************************************\n" +
                                 "Teacher ID: " + lecturer.getteacher_id() + "\n" +
                                 "Teacher Name: " + lecturer.getTeacher_name() + "\n" +
                                 "Address: " + lecturer.getaddress() + "\n" +
                                 "Working Type: " + lecturer.getworking_type() + "\n" +
                                 "Employment Status: " + lecturer.getemployment_status() + "\n" +
                                 "Working Hours: " + lecturer.getworking_hours() + "\n" +
                                 "Years Of Experience: " + lecturer.getYearsOfExperience() + "\n" +
                                 "Department: " + lecturer.getDepartment() + "\n";
                                 
                JOptionPane.showMessageDialog(lecturerFrame, message, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(lecturerFrame, "Please fill in all the fields to display.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
}




// Method to clear lecturer fields
public void clearLecturerFields() {
    teacherIdField.setText("");
    nameField.setText("");
    addressField.setText("");
    workingTypeComboBox.setSelectedIndex(0);
    employmentStatusField.setText("");
    gradedScoreField.setText("");
    YearsOfExpLecturerField.setText("");
    workingHoursField.setText("");
    department_lecturerfield.setText("");
}

public void remove_tutor() {
    if (teacherIdField.getText().isEmpty()){
        JOptionPane.showMessageDialog(tutorFrame, "Please fill in all the fields to remove tutor.", "Warning", JOptionPane.WARNING_MESSAGE);
    } else {
        try {
            Tutor tutor=null;
            int teacher_id = Integer.parseInt(teacherIdField.getText());
            if(list.isEmpty()==false){
                for (Teacher object : list) {
                    if (object instanceof Tutor) {
                        Tutor temp=(Tutor) object;
                        if (teacher_id == temp.getteacher_id() && temp.getisCertified()==false) {
                            tutor=temp;
                            break;
                        }
                        }
                    }
                }   
            if (tutor!= null) { 
                tutor.removeTutor();
                JOptionPane.showMessageDialog(tutorFrame, "Tutor of teacher id"+teacher_id+"is removed","Message",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(tutorFrame, "No tutor found with the specified teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(tutorFrame, "Please enter valid data for numeric fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



public void display_tutor() {
    if(list.isEmpty()==false){
        for (Teacher element : list) {
        if (element instanceof Tutor) {
            Tutor tutor = (Tutor) element; 
            
            String message = "***************************************INFORMATION************************************************\n" +
                                "Teacher ID: " + tutor.getteacher_id() + "\n" +
                                 "Teacher Name: " + tutor.getTeacher_name() + "\n" +
                                 "Address: " + tutor.getaddress() + "\n" +
                                 "Working Type: " + tutor.getworking_type() + "\n" +
                                 "Employment Status: " + tutor.getemployment_status() + "\n" +
                                 "Working Hours: " + tutor.getworking_hours() + "\n" +
                                 "Salary: " + tutor.getsalary() + "\n" +
                                 "Specialization: " + tutor.getspecialization() + "\n"+
                                 "academic qualifications: " + tutor.getacademic_qualifications() + "\n" +
                                 "Performance Index: " + tutor.getperformanceindex() + "\n";
                                 
                JOptionPane.showMessageDialog(lecturerFrame, message, "Lecturer Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
    else{
        JOptionPane.showMessageDialog(tutorFrame, "Please fill in all the fields to display.", "Warning",JOptionPane.WARNING_MESSAGE);
    }
}
public void setSalary(){
    if (teacherIdField.getText().isEmpty() || salaryField.getText().isEmpty() || performanceIndexField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(tutorFrame, "Please fill in all the fields to set salary.", "Warning", JOptionPane.WARNING_MESSAGE);
    } else {
        try {
            int teacher_id = Integer.parseInt(teacherIdField.getText());
            double newsalary = Double.parseDouble(salaryField.getText());
            int newperformanceindex = Integer.parseInt(performanceIndexField.getText());
            
            if (!list.isEmpty()) {
                Tutor tutor = null;
                for (Teacher object : list) {
                    // Check if the object in the list is an instance of Tutor
                    if (object instanceof Tutor) {
                        if (teacher_id == object.getteacher_id()) {
                            // Downcast the object to Tutor
                            tutor = (Tutor) object;
                            break;
                        }
                    }
                }
                if (tutor != null) {
                    // Set the new salary and performance index for the tutor
                    tutor.newmethod(newsalary,newperformanceindex);
                    
                    // Display the updated salary and performance index
                    JOptionPane.showMessageDialog(tutorFrame, "New Salary: " + tutor.getsalary() + "\n" + "Performance Index: " + tutor.getperformanceindex(), "Salary Update", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(tutorFrame, "Please enter a valid teacher id!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(tutorFrame, "Can't update salary when the list is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            JOptionPane.showMessageDialog(tutorFrame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}




public void Addtutor() {
    if (teacherIdField.getText().isEmpty() || nameField.getText().isEmpty() || addressField.getText().isEmpty()
            || workingTypeComboBox.getSelectedItem() == null || employmentStatusField.getText().isEmpty()
            || workingHoursField.getText().isEmpty() || salaryField.getText().isEmpty()
            || specializationField.getText().isEmpty() || academicQualificationsField.getText().isEmpty()
            || performanceIndexField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(tutorFrame, "Please fill in all the fields to add tutor.", "Warning",JOptionPane.WARNING_MESSAGE);
    } else {
        try {
            int teacher_id = Integer.parseInt(teacherIdField.getText());
            String teacher_name = nameField.getText();
            String address = addressField.getText();
            String working_type = (String) workingTypeComboBox.getSelectedItem();
            String employment_status = employmentStatusField.getText();
            Integer working_hours = Integer.parseInt(workingHoursField.getText());
            Integer salary = Integer.parseInt(salaryField.getText());
            String specialization = specializationField.getText();
            String academic_qualifications = academicQualificationsField.getText();
            int performanceindex = Integer.parseInt(performanceIndexField.getText());
            
            if(list.isEmpty()){
            Tutor tutor = new Tutor(teacher_id, teacher_name, address, working_type, employment_status, working_hours,
            salary, specialization, academic_qualifications, performanceindex);
            list.add(tutor);
            JOptionPane.showMessageDialog(tutorFrame, "Tutor added successfully.", "Success",JOptionPane.INFORMATION_MESSAGE);
            }else{
                boolean isAdded=true;
                for(Teacher element:list){
                    if(teacher_id==element.getteacher_id() && element instanceof Tutor){
                        isAdded=false;
                        break;
                    }
                }
                if(isAdded==true){
                    Tutor tutor=new Tutor(teacher_id,teacher_name,address,working_type,employment_status,working_hours,salary,specialization,academic_qualifications,performanceindex);
                    list.add(tutor);
                    
                    JOptionPane.showMessageDialog(tutorFrame,"Tutor is added successfully","Message",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(tutorFrame,"teacher id already exists","Message",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(lecturerFrame, "Please enter valid data for numeric fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

public void clearTutorFields() {
    teacherIdField.setText("");
    nameField.setText("");
    addressField.setText("");
    workingTypeComboBox.setSelectedIndex(0);
    employmentStatusField.setText("");
    workingHoursField.setText("");
    salaryField.setText("");
    specializationField.setText("");
    academicQualificationsField.setText("");
    performanceIndexField.setText("");
}

    @Override
  // ActionListener implementation
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == home_lecturer) {
        open_lecturer();
        frame.dispose();
    } else if (e.getSource() == home_tutor) {
        open_tutor();
        frame.dispose();
    } else if (e.getSource() == goToTutorButton) {
        open_tutor();
        lecturerFrame.dispose();
    } else if (e.getSource() == goToLecturerButton) {
        open_lecturer();
        tutorFrame.dispose();
    } else if (e.getSource() == displaylecturer) {
        display_lecturer();
    } else if(e.getSource()==displaytutor){
        display_tutor();
    }
    else if (e.getSource() == addtolecturerbtn) {
        ADDlecturer();
    } else if (e.getSource() == addButton) {
        Addtutor();
    }else if (e.getSource() == clearButton) {
        clearLecturerFields();
    } else if (e.getSource() == clearBtn) {
        clearTutorFields();
    } else if (e.getSource() == setSalaryButton) {
        setSalary();
    } else if (e.getSource() == gradeAssignmentButton) {
        assignmentbutton();
    } else if (e.getSource() == removeButton) {
        remove_tutor();
    }
}

  
    public void open_tutor() {
        tutorFrame = new JFrame("Tutor GUI");
        tutorFrame.getContentPane().setBackground(new Color(45, 67, 86));
        
        image=new ImageIcon("background.png");
        img=new JLabel(image);
        img.setBounds(150,300,600,500);
        tutorFrame.add(img);
        
        JLabel tutorLabel = new JLabel("Tutor");
        tutorLabel.setFont(new Font("Arial",Font.BOLD,30));
        tutor_title_panel=new JPanel();
        tutor_title_panel.setBounds(0,0,1000,40);
        tutor_title_panel.setBackground(new Color(180, 180, 184));
        tutorLabel.setBounds(440, 10, 100, 30);
        teacherIdLabel = new JLabel("Teacher ID:");
        teacherIdLabel.setForeground(Color.WHITE);
        teacherIdLabel.setBounds(50, 50, 100, 30);
        nameLabel = new JLabel("Teacher Name:");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(50, 100, 100, 30);
        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 150, 150, 30);
        addressLabel.setForeground(Color.WHITE);
        workingTypeLabel = new JLabel("Working Type:");
        workingTypeLabel.setBounds(50, 200, 150, 30);
        workingTypeLabel.setForeground(Color.WHITE);
        employmentStatusLabel = new JLabel("Employment Status:");
        employmentStatusLabel.setBounds(50, 250, 150, 30);
        employmentStatusLabel.setForeground(Color.WHITE);
        workingHoursLabel = new JLabel("Working Hours:");
        workingHoursLabel.setBounds(550, 50, 100, 30);
        workingHoursLabel.setForeground(Color.WHITE);
        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(550, 100, 100, 30);
        salaryLabel.setForeground(Color.WHITE);
        JLabel specializationLabel = new JLabel("Specialization:");
        specializationLabel.setBounds(550, 150, 150, 30);
        specializationLabel.setForeground(Color.WHITE);
        JLabel academicQualificationsLabel = new JLabel("Academic Qualifications:");
        academicQualificationsLabel.setBounds(550, 200, 150, 30);
        academicQualificationsLabel.setForeground(Color.WHITE);
        JLabel performanceIndexLabel = new JLabel("Performance Index:");
        performanceIndexLabel.setBounds(550, 250, 150, 30);
        performanceIndexLabel.setForeground(Color.WHITE);
        
        // Creating JComboBox for working type
        workingTypeComboBox = new JComboBox();
        workingTypeComboBox.addItem("Full-time");
        workingTypeComboBox.addItem("Part-time");
        workingTypeComboBox.addItem("Contract");
        workingTypeComboBox.addItem("Temporary");

        teacherIdField = new JTextField();
        teacherIdField.setBounds(200, 50, 150, 30);
        nameField = new JTextField();
        nameField.setBounds(200, 100, 150, 30);
        addressField = new JTextField();
        addressField.setBounds(200, 150, 150, 30);
        workingTypeComboBox.setBounds(200, 200, 150, 30);

        employmentStatusField = new JTextField();
        employmentStatusField.setBounds(200, 250, 150, 30);
        workingHoursField = new JTextField();
        workingHoursField.setBounds(700, 50, 150, 30);
        salaryField = new JTextField();
        salaryField.setBounds(700, 100, 150, 30);
        specializationField = new JTextField();
        specializationField.setBounds(700, 150, 150, 30);
        academicQualificationsField = new JTextField();
        academicQualificationsField.setBounds(700, 200, 150, 30);
        performanceIndexField = new JTextField();
        performanceIndexField.setBounds(700, 250, 150, 30);

        addButton = new JButton("Add Tutor");
        addButton.setBounds(30, 350, 150, 50);
        
        setSalaryButton = new JButton("Set Salary");
        setSalaryButton.setBounds(700, 290, 150, 50);

        removeButton = new JButton("Remove Tutor");
        removeButton.setBounds(830, 400, 150, 50);
        
        displaytutor = new JButton("Display Details");
        displaytutor.setBounds(30, 450, 150, 60); 
        
        goToLecturerButton = new JButton("Go to Lecturer"); 
        goToLecturerButton.setBounds(830, 700, 150, 50);
        goToLecturerButton.addActionListener(this); 
        
        clearBtn= new JButton("Clear"); 
        clearBtn.setBounds(860,45, 120, 40); 
        
        // Adding ActionListener
        addButton.addActionListener(this);
        displaytutor.addActionListener(this);
        removeButton.addActionListener(this);
        setSalaryButton.addActionListener(this);
        clearBtn.addActionListener(this);


        // Adding components to frame
        tutorFrame.add(tutorLabel);
        tutorFrame.add(teacherIdLabel);
        tutorFrame.add(nameLabel);
        tutorFrame.add(addressLabel);
        tutorFrame.add(workingTypeLabel);
        tutorFrame.add(employmentStatusLabel);
        tutorFrame.add(workingHoursLabel);
        tutorFrame.add(salaryLabel);
        tutorFrame.add(specializationLabel);
        tutorFrame.add(academicQualificationsLabel);
        tutorFrame.add(performanceIndexLabel);
        tutorFrame.add(teacherIdField);
        tutorFrame.add(nameField);
        tutorFrame.add(addressField);
        tutorFrame.add(workingTypeComboBox);
        tutorFrame.add(employmentStatusField);
        tutorFrame.add(workingHoursField);
        tutorFrame.add(salaryField);
        tutorFrame.add(specializationField);
        tutorFrame.add(academicQualificationsField);
        tutorFrame.add(performanceIndexField);
        tutorFrame.add(addButton);
        tutorFrame.add(setSalaryButton);
        tutorFrame.add(removeButton);
        tutorFrame.add(goToLecturerButton); 
        tutorFrame.add(tutor_title_panel);
        tutorFrame.add(displaytutor);
        tutorFrame.add(clearBtn);
        
        

        // Setting JFrame properties
        tutorFrame.setSize(1000, 800);
        tutorFrame.setLayout(null);
        tutorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tutorFrame.setResizable(false);
        tutorFrame.setVisible(true);
    }
    public static void main(String[] args) {
    TeacherGUI teacherGUI=new TeacherGUI();
}
}

