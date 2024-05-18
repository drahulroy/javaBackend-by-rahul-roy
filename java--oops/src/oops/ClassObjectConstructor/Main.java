package oops.ClassObjectConstructor;

import oops.Student;

public class Main {
    public static void main(String[] args) {

        // Declaring a variable of type Student
        Student s1;
        // Creating an instance of Student using the default constructor and assigning it to s1
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
        // Creating an instance of Student using the parameterized constructor with one argument and assigning it to s2
        s2 = new Student(2);

        // Setting properties for the student object s2
        s2.studentId = 2;
        s2.studentname = "sahm";
        s2.studentage = 34;

        // Calling methods on the student object s2
        s2.study();
        s2.showFullDetails();

        // Declaring another variable of type Student
        Student s3;
        // Creating an instance of Student using the parameterized constructor with two arguments and assigning it to s3
        s3 = new Student(10, "raju");

        // Calling methods on the student object s3
        s3.study();
        s3.showFullDetails();

        // Demonstrating method overloading
        s3.study(2); // Calls the overloaded study method with one argument
        s3.study("math"); // Calls the overloaded study method with one string argument
    }
}
