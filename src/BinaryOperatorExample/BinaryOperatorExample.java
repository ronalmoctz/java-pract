package BinaryOperatorExample;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /**
         * Recibe dos valores del mismo tipo y retorna un valor del mismo tipo.
         */
        BinaryOperator<Integer> binaryOperator = (a , b) -> {
            return a + b;
        };
        int result = binaryOperator.apply(10, 20);

        System.out.println(result);
    }
}
