package oops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Compile-time polymorphism (Method Overloading)
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + calc.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));

        // Runtime polymorphism (Method Overriding)
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Method calls resolved at runtime
        myDog.makeSound();  // Outputs: Dog barks
        myCat.makeSound();  // Outputs: Cat meows

        // Demonstrating polymorphic behavior
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound();  // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound();  // Outputs: Cat meows
    }
}
