package basics;

public class Inherit {
    // Parent class
        static class Animal {
            String name;

             void eat() {
                System.out.println("Animal is eating");
            }
        }

        // Child class
        static class Dog extends Animal {

             void bark() {
                System.out.println("Dog is barking");
            }
        }

        // Main method
        public static void main(String[] args) {

            Dog dog = new Dog();
            dog.name = "Tommy";

            dog.eat();   // inherited method
            dog.bark();  // child method
        }
    }


