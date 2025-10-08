package functions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionExercises {
    public static void main(String[] args) {
        //1.- Crea una funcion que imprima "!Te dos la bienvenida al cuso de Java desde cero!
//        saludoGente();
        //2.- Crea una funcion que reciba un nombre como parametro y salude a esa persona
//        saludoPersonal();
        //3.- Haz un metodo que reciba dos numeros enteros y devuelva su resta
//        operacionAritmetica();
        //4.- Crea un metodo que calcule el cuadrado de un numero (n*n)
//        elevadocuadrado();
        //5.- Escribre una funcion que reciba un numero y diga si es par o inpar
//        parOinpar();
        //6.- Crea un metodo que reciba una edad y retorne true si es mayor de edad
//        esMayorDeEdad();
        //7.- Implementa una funcion que reciba una cadena y retorne su logitud
//        longString();
        //8.- Crea un metodo que reciba una array de enteros, calcula su media y lo retorna
//        medirMedia();
        //9.- Escribre un metodo que reciba un numero y retorna su factorial
//        medirFactorial();
        //10.- Crea una funcion que reciba un ArrayList<String> y recorra mostrando cada elemento
        recorerArrayList();
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

    public static void elevadocuadrado(){
        System.out.println("Operacion para saca el cuadrado de un numero");

        Scanner num = new Scanner(System.in);

        var number = num.nextInt();

        var total = number*number;

        System.out.println("El cuadrado de " + number + " es " + total);
    }

    public static void parOinpar(){
        System.out.println("Sera par o inpar?");

        Scanner operation = new Scanner(System.in);

        var inNumber = operation.nextInt();

        if (inNumber % 2 == 0){
            System.out.println("El numero " + inNumber + " es par.");
        }else {
            System.out.println("El numero " + inNumber + " es impar.");
        }
    }

    public static void esMayorDeEdad(){
        System.out.println(" Eres mayor de edad para poder pasar?");

        Scanner humano = new Scanner(System.in);

        var edad = humano.nextInt();

        if (edad >= 18){
            System.out.println("Cumples con la edad de " + edad + " years puedes pasar");
        }else {
            System.out.println("No puede entrar tienes " + edad);
        }
    }

    public static  void longString(){
        System.out.println("Cuanto mide el String?");

        Scanner cadena = new Scanner(System.in);

        String caracteres = cadena.nextLine();

        var longitud = caracteres.length();

        System.out.println("La palabra " + caracteres + " contiene un total de " + longitud + " letras");
    }

    public static void medirMedia(){
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(6);
        numeros.add(4);
        numeros.add(5);
        numeros.add(13);
        numeros.add(48);
        numeros.add(23);
        numeros.add(12);

        double media = numeros.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("La media es " + media);
    }

    public static void medirFactorial(){
        System.out.println("CUAL SERA EL FACTORIAL!?");

        Scanner numero = new Scanner(System.in);

        var number = numero.nextInt();

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("El factorial de " + number + " es: " + fact);
    }

    public static void recorerArrayList(){
        ArrayList<String> elementos = new ArrayList<>();

        elementos.add("Rooberto");
        elementos.add("Ronal");
        elementos.add("Fer");
        elementos.add("Teres");

        for (String elemento: elementos){
            System.out.println("Elemento: " + elemento);
        }
    }
}
