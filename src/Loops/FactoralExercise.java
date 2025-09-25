package Loops;

import java.math.BigInteger;
import java.util.Scanner;

public class FactoralExercise {
    public static void main(String[] args) {
        System.out.println("Introduzca un número para conseguir el factorial:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("El factorial de " + number + " es: " + factorial(number));
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}