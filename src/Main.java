public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.sound();
        dog.play();
        System.out.println("\n");
        cat.eat();
        cat.sound();
        cat.play();
    }
}

class Dog implements Animal, Pet{
    public static void main(String[] args) {

    }

    @Override
    public void eat() {
        System.out.println("Собака ест мясо");
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }

    @Override
    public void play() {
        System.out.println("Собака играет с мячом");
    }
}
class Cat implements Animal, Pet{
    public static void main(String[] args) {

    }

    @Override
    public void eat() {
        System.out.println("Кот ест рыбов");
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }

    @Override
    public void play() {
        System.out.println("Кот играет с мышью");
    }
}

