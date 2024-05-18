# Abstraction Example

This project demonstrates the concepts of abstraction in Java using both abstract classes and interfaces.

## Structure

- Abstract Class Example:
  - `Vehicle`: An abstract class with both abstract and concrete methods.
  - `Car` and `Motorcycle`: Concrete subclasses that implement the abstract method.

- Interface Example:
  - `Shape`: An interface with abstract and default methods.
  - `Circle` and `Rectangle`: Classes that implement the interface.

## Running the Examples

1. Compile the project:
   ```sh
   javac -d bin src/oops/Abstraction/*.java
   ```

2. Run the abstract class example:
   ```sh
   java -cp bin oops.Abstraction.MainAbstractClass
   ```

3. Run the interface example:
   ```sh
   java -cp bin oops.Abstraction.MainInterface
   ```

## Note

You can also import this project into an IDE like IntelliJ IDEA or Eclipse for easier management and execution.
