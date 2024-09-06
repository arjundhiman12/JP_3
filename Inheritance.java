// Base class
class Animal {
    // Method in the base class
    void eat() {
        System.out.println("This animal eats food.");
    }

    // Method in the base class
    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Derived class
class Dog extends Animal {
    // Method specific to the derived class
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to demonstrate inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of the derived class
        Dog myDog = new Dog();

        // Call methods from the base class
        myDog.eat();
        myDog.sleep();

        // Call method from the derived class
        myDog.bark();
    }
}
