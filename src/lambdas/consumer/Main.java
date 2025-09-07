package lambdas.consumer;

import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Consumer
        Recibe un valor y no retorna nada
         */
//        Consumer<String> consumer = (param) -> {
//            System.out.println(param);
//        };
        /**
         * Esto se puede acortar
         */
        Consumer<String> consumer = System.out::println; //los dos :: podemos llamadar al method

        consumer.accept("Santiago");
    }
}