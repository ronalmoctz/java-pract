package POO;

public class Dog {
    String name;
    Integer age;

    public Dog(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void bark(){
        System.out.println(name + " say " + "Woof!");
    }
}
