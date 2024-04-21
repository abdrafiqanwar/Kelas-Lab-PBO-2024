package Inheritance;

public class Animal {
    String name = "Animal";
    int umur;

    void eat(){
        System.out.println("this animal is eating");
    }

    void sleep(){
        System.out.println("this animal is sleeping");
    }

    void show(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + umur);
    }

    
}

class Dog extends Animal{
    private String name = "Dog";
    String age;
    
    void eat(){
        System.out.println("this dog is eating");
    }

    void show(){
        System.out.println("Name is " + super.name);
    }
    
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.name = "animal";
        // animal.umur = 2;
        // animal.show();
        // animal.eat();
        // animal.sleep();

        Dog dog = new Dog();
        // dog.name = "Anjing";
        // dog.umur = 2;
        dog.show();
        dog.eat();
        // dog.sleep();
    }
}