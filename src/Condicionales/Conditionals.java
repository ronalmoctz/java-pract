package Condicionales;

public class Conditionals {
    public static void main(String[] args) {
        // Condiocionales
        var age = 18;

        System.out.println(age >= 18);

        if (age > 18){
        System.out.println("El usuario es mayor de edad");
        } else if (age == 18){
            System.out.println("El usuario tiene 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        var day = 1;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes o miercoles");
        }

    }
}
