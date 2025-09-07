package Condicionales;

public class ConditionalsExcercises {
    public static void main(String[] args) {
        //1.- Establece la edad de un usuario y muestra si puede votar(mayor igual a 18)
        Integer user = 18;

        if (user >= 18){
            System.out.println("Puede pasar a votar eres mayor de edad");
        } else {
            System.out.println("Aun no eres mayor de edad no puedes votar");
        }

        //2.- Declara dos numeros y muestra cual es mayor, o si son iguales
        Integer number_one = 95;
        var number_two = 45;

        if(number_one.equals(number_two)){
            System.out.println("Los numeros son iguales");
        } else if  (number_one > number_two){
            System.out.println("El primer numero es mayor al segundo");
        } else {
            System.out.println("El segundo numero es mayor que el primero");
        }

        //3.-Dado un numero, verifica si es positivo, negativo o cero
        var number = 104;
        if (number < 0){
            System.out.println("El numero es negativo");
        } else if ( number > 0) {
            System.out.println("el numero es positivo");
        } else  {
            System.out.println("el numero es igual a cero");
        }

        // 4.- Crea un programa que diga si un numero es par o impar
        if (number%2 == 0){
            System.out.println("es un numero par");
        } else {
            System.out.println("es impar");
        }

        // 5.- Verifica si un numero esta en un rango de 1 a 100

        var maximo = 100;
        var minimo = 1;

        if (number >= minimo && number <= maximo){
            System.out.println("El numero esta en el rango");
        }else {
            System.out.println("El numero esta fuera del rango");
        }

        // 6.- Declara una variable con el dia de la semana (1-7) y muestra su nombre con switch
        var day = 7;
        switch (day){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("No es un dia valido");
        }

        // 7.- Simula un sistema de notas: muestra "Sobresaliente", "Aceptado" o "Suspenso" segun la nota (0-100)
       var nota = 90;

        if (nota >= 90){
            System.out.println("Nota Sobresaliente");
        } else if (nota >= 70) {
            System.out.println("Nota Aceptable");
        } else {
            System.out.println("Nota Reprobable");
        }
        // 8.-Escribre un rograma que determine si puedes entrar al cine: debes tener almenos 15 years o ir con acompanado
        var persona = 13;
        var padre = true;

        if (persona >= 15 || padre == true){
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
        //9.- Crea un programa que diga si una letra es vocal o consonante (char)
        Character ch = 'i';

        if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " es vocal");
        } else {
            System.out.println(ch + " es consonante");
        }
        // 10.- Usa tres variables a, b, c y muestra cual es el mayor de los tres
        var a = 15;
        var b = 22;
        var c = 19;
        if (a > b && a > c){
            System.out.println(a + " es mayor que " + b);
        } else if (b > c && b > a) {
            System.out.println(b + "  es mayor que " + c);
        }else {
            System.out.println(c + " es mayor que " + a + " y " + b);
        }
    }
}
