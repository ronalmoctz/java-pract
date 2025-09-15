package EstructuraDeDatos;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class List {
    public static void main(String[] args) {

        // Declaracion y creacion de los Array List
        ArrayList<String> names = new ArrayList<>(); // clasico
        var number = new ArrayList<Integer>(); //-> no expta primitovs solo clases u obejtos (moderno)

        // Tamano
        System.out.println(names.size());

        //Agregar elemento
        names.add("Ronaldo");
        names.add("Moctezuma");
        names.add("Octubre");
        System.out.println(names.size());

        //Acceder a los datos
        System.out.println(names.get(1));

        //Modificar datos
        names.set(1, "ronal.moctz@gmail.com");
        System.out.println(names.get(1));

        // Eliminar un dato
        names.remove(2);
        System.out.println(names.size());

        //buscar un elemento
        System.out.println(names.contains("Ronaldo"));

        //Limpiar array list
        names.clear();
        System.out.println(names.size());


    }
}
