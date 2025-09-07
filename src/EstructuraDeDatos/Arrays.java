package EstructuraDeDatos;

public class Arrays {
    public static void main(String[] args) {

        // Declaracion y creacion
        int[] numbers = new int [3];
        System.out.println(numbers);

        String[] names = {"Ronaldo", "Jaime", "Daniel"};
        System.out.println(names);

        //Acceso
        System.out.println((new String[3])[0]);

        //Modificacion
        numbers[0] = 12;
        numbers[1]=923;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(names.length);
        names[2] = "Ronaldhino";
        names[2] = null;
        System.out.println(names.length);


    }
}
