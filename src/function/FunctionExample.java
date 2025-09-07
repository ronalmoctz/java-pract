package function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /**
         * Function
         * Recibe un valor y retorna un valor
         */
        Function<Integer, String> function = (num) -> {
            return "El numero es: " + num;
        };
       String result = function.apply(5);
       System.out.println(result);
    }
}
