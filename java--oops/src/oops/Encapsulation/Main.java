package oops.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", 30, "123 Main St");

        // Displaying initial details
        person.displayDetails();

        // Modifying details using setter methods
        person.setName("Jane Doe");
        person.setAge(25);
        person.setAddress("456 Elm St");

        // Displaying modified details
        person.displayDetails();

        // Attempting to set an invalid age
        person.setAge(-5);  // Will print an error message and not change the age
    }
}
