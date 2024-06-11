// Code to showcase inheritance

// Base class
class Animal {
    // Method in the base class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class to test the inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of the base class
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Output: Animal makes a sound

        // Creating an object of the derived class
        Dog myDog = new Dog();
        myDog.makeSound();     // Output: Dog barks

        // Using the base class reference to point to the derived class object
        Animal myAnimalDog = new Dog();
        myAnimalDog.makeSound(); // Output: Dog barks
    }
}
