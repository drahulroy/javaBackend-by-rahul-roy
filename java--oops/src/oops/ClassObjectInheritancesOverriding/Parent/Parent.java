package oops.ClassObjectInheritancesOverriding.Parent;

// Base class Parent
public class Parent {
    // Overridden method
    public void m1() {
        System.out.println("I AM Parent m1()");
    }
}

//FYI public > protected > default > private

// Derived class Child extending Parent
class Child extends Parent {
    // Overriding method with covariant return type
    @Override
    public void m1() {
        System.out.println("I AM Child m1()");
    }
}

