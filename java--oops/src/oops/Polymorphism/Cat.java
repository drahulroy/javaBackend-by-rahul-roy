package oops.Polymorphism;

// Cat class extending Animal
public class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
