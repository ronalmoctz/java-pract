package Loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
        // Loops

        // - for controlado por contador

        for (int index = 0; index < 5; index++) {
            System.out.println("Hola, Java!");
        }

        String[] names = {"ronal", "luis", "fernanda", "miguel"};

        for (int index = 0; index < names.length; index++){
            System.out.println(names[index]);
        }

        // for-each
        for (String name: names){
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (Integer number: numbers){
            System.out.println(number);
        }

        var address = new HashMap<String, String>();

        address.put("Daniel", "772156516");
        address.put("Jaime", "771144561");
        address.put("Teresa", "777254562");
        for (Map.Entry<String, String> location: address.entrySet()){
            System.out.println(location);
        }

        // - while
        int index = 0;
        while (index < 5){
            System.out.println("Hola mundo");
            index++;
        }

        /**
         * Jugando un poco con la condicionales e if
         */
        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("fernanda")){
                find = true;
            }
            index++;
        }

        // -do-while

        index = 0;

        do {
            System.out.println("Hola, Java");
            index++;
        } while (index < 0);

        // control de bucles

        // Break

        for (String name: names){
            if (name.equals("fernanda")){
                break;
            }
            System.out.println(name);
        }

        // - continue

        for (int i = 0; i < 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
