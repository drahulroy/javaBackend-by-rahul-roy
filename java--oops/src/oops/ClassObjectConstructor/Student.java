package oops.ClassObjectConstructor;

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

    // Default constructor
    public Student() {
        // Constructor body
        System.out.println("I am first");
    }

    // Parameterized constructor with one argument
    public Student(int s) {
        // Constructor body
        this.studentId = s;
        System.out.println("I am 2nd");
    }

    // Parameterized constructor with two arguments
    public Student(int id, String name) {
        // Initializing instance variables with the provided arguments
        this.studentId = id;
        this.studentname = name;
        System.out.println("I am 3rd");
    }

    // Method to simulate studying
    public void study() {
        System.out.println("Student id " + this.studentId + " " + this.studentname + " is studying in this university");
    }

    // Overloaded study method with one int argument
    public void study(int hours) {
        System.out.println("Student id " + this.studentId + " " + this.studentname + " is studying for " + hours + " hours");
    }

    // Overloaded study method with one String argument
    public void study(String subject) {
        System.out.println("Student id " + this.studentId + " " + this.studentname + " is studying " + subject);
    }

    // Method to display full details of the student
    public void showFullDetails() {
        System.out.println("Student Id: " + this.studentId);
        System.out.println("Student Name: " + this.studentname);
        System.out.println("Student age: " + this.studentage);
        System.out.println("Student Gender: " + this.studentgender);
        System.out.println("Student Major: " + this.studentmajor);
        System.out.println("Student Course: " + this.studentcourse);
        System.out.println("Student Phone: " + this.studentphone);
    }
}
