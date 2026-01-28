public class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}
class Dog extends Animal{
        public void sound()
        {
            System.out.println("Woof!!");

        }
    }
    class Cat extends Animal{
        String breed;
        public void sound()
        {
            System.out.println("Meow!!");
        }

    }



