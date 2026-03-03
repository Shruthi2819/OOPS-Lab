abstract class Animal {
    static String type = "Living Being";

    final void sound() {
        System.out.println("Animals make sound");
    }

    abstract void eat();
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats food");
    }
}

public class Animal1 {
    public static void main(String[] args) {
        System.out.println(Animal.type);
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}