package Loops;

import java.util.*;

public class LoopsExecises {
    public static void main(String[] args) {
        // 1/- Imprime los numeros del 1 al 10 usando while
       int i = 0;
        while (i < 10){
            i++;
//            System.out.println(i);
        }

        // 2.- Usa do-while para moestrar todos los valores de un ArrayList

        var numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(67);
        numeros.add(9);
        numeros.add(2);

        int index = 0;

        if (!numeros.isEmpty()){
            do {
                System.out.println(numeros.get(index));
                index++;
            } while (index < numeros.size());
        }

        // 3.- Imprimre los multiplos de 5 del 1 al 50 usando for
        for (int multi = 0; multi <= 50; multi += 5){
            System.out.println(multi);
        }

        // 4.- Recorrer un Array de 5 numeros e imprime la suma total.

        Integer[] numbers = {4, 6, 7, 8, 2};
        int total = 0;

        for (int suma = 0; suma < numbers.length; suma++){
            total += numbers[suma];
        }
            System.out.println(total);

        // 5.- Usa un for para recorrer un Array y mostrar sus valores
        for (int start = 0; start < numeros.size() ; start++ ){
            System.out.println(numeros.get(start));
        }

        // 6.- Usa for-each para recorrer un HashSet y un HashMap.
        var address = new HashMap<String, String>();

        address.put("Daniel", "772156516");
        address.put("Jaime", "771144561");
        address.put("Teresa", "777254562");
        for (Map.Entry<String, String> location: address.entrySet()){
            System.out.println(location);
        }
        HashSet<Integer> randoms = new HashSet<>();
        randoms.add(5);
        randoms.add(9);
        randoms.add(3);
        randoms.add(12);
        randoms.add(11);
        for (Integer random: randoms){
            System.out.println(random);
        }

        // 7.- imprimre los numeros del 10 al 1 (decendientes) con un bucle for
        Integer[] orden = {1, 2 , 3, 7, 6 ,-5 ,4 ,2 , 1};
        Arrays.sort(orden, (a, b) -> b - a);
        for ( Integer order: orden){
            System.out.println(order);
        }

        // 8.- Usa "continue" para saltar los multiplos de 3 del 1 al 20
        for ( int range = 1; range <= 20; range++ ){
            if (range % 3 == 0){
                continue;
            }
            System.out.println(range);
        }

        // 9.- Usa break para detener un bucle cuando encuentres un numero negativo
        for (Integer orde: orden){
            if (orde < 0){
                break;
            }
            System.out.println(orde);
        }
        // 10.- Crea un programa que calcule el factorial de un numero dado

        //Relizada en FactorialExercise✅
    }
}
