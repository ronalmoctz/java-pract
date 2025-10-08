package POO;

public class ClassesExercises {
    public static void main(String[] args) {
        //1.- Crear una clase Book con atributos y author. Crea un obejto y muestra sus datos.
        var book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1996);
        book.showBooksData();
        //2.- Crea una clase Dog con metodo bark() que imprima "Woof!".
        var dog = new Dog("Buddy", 3);
        dog.bark();
        //3.- Agrega un contructor a la clase Book que reciba title y author.
        var book2 = new Book("1984", "George Orwell", 1949);
        book2.showBooksData();
        //4.- Crea una clase Car con astributos brand y model ,y un metodo showData().
        var car = new Car("Toyota", "Corolla");
        car.showData();
        //5.- crea una clase Student con atributos score y un metodo que diga si aprovo (mayor o igual a 60 )
        var student = new Student("Roberto", 61);
        student.isPassed();
        //6.- Crea una clase BankAccount con atributo balance y metodo deposit() que sume el saldo.
        new BankAccount(3329.93).newBalance();
        //7.- Crea una clase Rectangle con metodos para calcular el area y el perimetro.

        //8.- Crea una clase Employee que reciba nombre y salario ,y un metodo para mostrar su salario.

        //9.- Crea varios obejtos Person y gudardalos en un ArrayList.

        //10.- Crea una clase Prduct y un metodo que aplique un descuento sobre su precio.
    }

}
