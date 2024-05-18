package oops;

public class main {
    public static void main(String[] args) {

        // Declaring a variable of type Student
        Student s1;
        // Creating an instance of Student and assigning it to s1
        s1 = new Student();

        // Setting properties for the student object s1
        s1.studentId = 1;
        s1.studentname = "ram";
        s1.studentage = 54;

        // Calling methods on the student object s1
        s1.study();
        s1.showFullDetails();

        // Declaring another variable of type Student
        Student s2;
        // Creating an instance of Student and assigning it to s2
        s2 = new Student();

        // Setting properties for the student object s2
        s2.studentId = 2;
        s2.studentname = "sahm";
        s2.studentage = 34;

        // Calling methods on the student object s2
        s2.study();
        s2.showFullDetails();
    }
}
