package suplier;

import java.util.function.Supplier;

public class SuplierExample {
    /**
     * Supplier
     * No recibe ningun valor, pero retorna un resultado
     */
   public static  void main(String[] args) {
       Supplier<String> suplier = () -> "Hola, soy  un Supplier";

       System.out.println(suplier.get());
   }
}
