package EstructuraDeDatos;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StructureExercises {

    public static void main(String[] args) {
    // 1.- Crea un Array con 5 valores e imprime su longitud
     String[] apodos = {"Ronal", "Clever", "James", "Dani", "Beto"};
     System.out.println(apodos.length + " Es la logitud ");

     /**
      * 2.- Modificar uno de los valores del Array e imprimir el valor del indice
      * antes y despues de modificarlo
      */

     System.out.println(apodos[1]);
     apodos[1] = "Wuicho";
     System.out.println(apodos[1]);

     // 3.- Agrega un ArrayList vacio
      var nombres = new ArrayList<String>();
        System.out.println(nombres.isEmpty());

        // 4.- agregar 4 valores al Array List y eliminar uno a continuacion
        nombres.add("Miguel");
        nombres.add("Leonardo");
        nombres.add("Guillermo");
        nombres.add("Jesus");

        System.out.println(nombres.size());
        nombres.remove("Jesus");
        System.out.println(nombres.size());

        // 5.- Crea un HashSet con 2 valores diferentes.
        var apellidos = new HashSet<String>();

        apellidos.add("Moctezuma");
        apellidos.add("Lopez");
        System.out.println(apellidos);
        // 6.- Agregar un nuevo valor repetido y otro sin repetir al HashSet
        apellidos.add("Moctezuma");
        apellidos.add("Cruz");
        System.out.println(apellidos);
        // 7.- Elimina uno de los elementos del HashSet
        apellidos.remove("Moctezuma");
        System.out.println(apellidos.size());

        // 8.- Crea un HashMap donde la clave sea un nombre y el otro valor el numero telefonico
        var address = new HashMap<String, String>();

        address.put("Daniel", "772156516");
        address.put("Jaime", "771144561");
        address.put("Teresa", "777254562");
        System.out.println(address);
        // 9.- Modifica u no de los contactos y elimina el otro
        address.put("Daniel", "7721566517");
        address.remove("Jaime");
        System.out.println(address);

        // 10.- Dado un Array, tranformalo en un ArrayList, a continuacion en un HashSet y finalmente en un HashMap con clave
        // valor iguales

        List al = Arrays.asList(apodos);
        System.out.println(al);
        HashSet<String> hst = new HashSet<>(al);
        System.out.println(hst);
        Map<String, String> myHashMap = hst.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
        System.out.println(myHashMap);

    }
}
