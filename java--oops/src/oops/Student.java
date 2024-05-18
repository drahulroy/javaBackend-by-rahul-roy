package oops;

// Creating class Student
class Student {
    // Declaring instance variables
    int studentId;
    String studentname;
    int studentage;
    String studentgender;
    String studentmajor;
    String studentcourse;
    String studentphone;

    // Method to simulate studying
    public void study() {
        System.out.println("Student id " + studentId + " " + studentname + " is studying in this university");
    }

    // Method to display full details of the student
    public void showFullDetails() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentname);
        System.out.println("Student age: " + studentage);
        System.out.println("Student Gender: " + studentgender);
        System.out.println("Student Major: " + studentmajor);
        System.out.println("Student Course: " + studentcourse);
        System.out.println("Student Phone: " + studentphone);
    }
}
