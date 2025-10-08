package POO;

public class Person {
    // Attributes

    String name;
    int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Methods
    public void syaHello(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
