package EstructuraDeDatos;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        //Declaracion y creacion
        HashMap<String, String> names = new HashMap<>(); //Se conforma de una clabe y valor
        var numbers = new  HashMap<Integer, String>();

        //Tamano
        System.out.println(names.size());

        // Agregar elementos

        names.put("Ronaldo", "Moctezuma");
        names.put("Daniel", "Moctezuma");
        names.put("Jaime", "Moctezuma");

        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elemetnos
        System.out.println(names.get("Ronaldo"));

        // verificar elementos
        System.out.println(names.containsKey("Ronaldo"));
        System.out.println(names.containsValue("Moctezuma"));

        // Elminar elementos
        names.remove("Ronaldo");
        System.out.println(names);

        //Limpiar HasMap
//        names.clear();
//        System.out.println(names);

        // Otras operaciones

        //modificar elementos
        names.put("Ronaldo", "moctz23@outlook.com");

        names.put("Daniel", "daniel123@gmail.com");
        System.out.println(names);

        names.replace("Daniel", "damoctz@gmail.com"); //remplaza el valor si exitse
        System.out.println(names);

        names.putIfAbsent("Ixtzchel", "ixMoctz@gmail.com");
        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
    }
}
