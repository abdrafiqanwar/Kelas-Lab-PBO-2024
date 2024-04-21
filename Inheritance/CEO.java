package Inheritance;

public class CEO{
    public static void main(String[] args) {
        Person person = new Person("Lala", 25);
        person.display();

        Employee employee = new Employee("Minul", 28, 2000000);
        employee.display();

        Manager manager = new Manager("Vivi", 30, 5000000, "Matematika");
        manager.display();
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("\nNama: " + name);
        System.out.println("Usia: " + age);
    }
}

class Employee extends Person{
    double salary;

    Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    void display(){
        super.display();
        System.out.println("Gaji: " + salary);
    }
}

class Manager extends Employee{
    String departmen;

    Manager(String name, int age, double salary, String departmen){
        super(name, age, salary);
        this.departmen = departmen;
    }

    void display(){
        super.display();
        System.out.println("Departemen: " + departmen);
    }
}