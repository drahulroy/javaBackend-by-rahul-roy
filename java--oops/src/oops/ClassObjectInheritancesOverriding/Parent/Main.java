package oops.ClassObjectInheritancesOverriding.Parent;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Parent
        Parent parent = new Parent();
        parent.m1();  // Calls Parent's m1()

        // Creating an instance of Child
        Child child = new Child();
        child.m1();  // Calls Child's m1()

        // Using Parent reference for Child object
        Parent parentReference = new Child();
        parentReference.m1();  // Calls Child's m1() due to polymorphism
    }
}
