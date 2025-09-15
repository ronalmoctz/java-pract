package BiPredicateExample;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        /**
         * BiPredicate
         * Recibe dos valores y devuelve un booleano (true or false)
         */
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            return a > b;
        };

        boolean result = biPredicate.test(10, 14);
        System.out.println(result);
    }
}
