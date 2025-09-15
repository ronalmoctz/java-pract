package EstructuraDeDatos;

import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

      // Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new  HashSet<Integer>();

        // Tamanio (Size)

        System.out.println(names.size());

        // Agregar elementos
        names.add("ronaldo");
        names.add("moctezuma");
        names.add("soy un set");
        names.add("no soy un duplicado");
        System.out.println(names.size());
//        System.out.println(names.getLast());
        System.out.println(names);

        //Eliminar elementos
        names.remove("ronaldo");

        // buscar elemento
        System.out.println(names.contains("ronaldo"));
        System.out.println(names.contains("moctezuma"));
    }
}
