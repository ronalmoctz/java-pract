package functions;

import java.util.Scanner;

public class FunctionExercises {
    public static void main(String[] args) {
        //1.- Crea una funcion que imprima "!Te dos la bienvenida al cuso de Java desde cero!
        saludoGente();
        //2.- Crea una funcion que reciba un nombre como parametro y salude a esa persona
        saludoPersonal();
        //3.- Haz un metodo que reciba dos numeros enteros y devuelva su resta
        operacionAritmetica();
        //4.- Crea un metodo que calcule el cuadrado de un numero (n*n)
        elevdocuadrado();
        //5.- Escribre una funcion que reciba un numero y diga si es par o inpar

        //6.- Crea un metodo que reciba una edad y retorne true si es mayor de edad
    }

    public static void saludoGente(){
        System.out.println("Hola bienvenidos al curso de Java!");
    }

    public static void saludoPersonal(){
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("Hola buenos dias 👋 " + name);
    }

    public static Integer operacionAritmetica(){
        System.out.println("BIENVEIDO HAZ TU SUMA!");

        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);


        Integer numberOne = one.nextInt();
        Integer numberTwo = two.nextInt();

        var total = numberOne + numberTwo;

        System.out.println("el total es " + total);

        return total;
    }

    public static void elevdocuadrado(){
        System.out.println("Operacion para saca el cuadrado de un numero");

        Scanner num = new Scanner(System.in);

        var number = num.nextInt();

        var total = number*number;

        System.out.println("El cuadrado de " + number + " es " + total);
    }

}
