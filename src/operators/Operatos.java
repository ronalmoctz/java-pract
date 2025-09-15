package operators;

public class Operatos {
    public static void main(String[] args) {
        // Declaracion
        String name = "Ronaldo";
        //Instacia muevo objeto
        var surname = new String("Motezuma");

        //Operaciones basicas

        //Concatenacion
        System.out.println(name + " " + surname);

        //Longitud
        System.out.println(name.length());

        //Obetner caracteres
        System.out.println(name.charAt(name.length() - 1)); //-> nos ayuda a conocer el ultimo de la lista

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        // Mayusculas y Minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Comprobar si contiene
        System.out.println("Hola, Java".contains("Ronaldo"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        //Comparacion
        System.out.println(name.equals("rOnaldo"));
        System.out.println(name.equalsIgnoreCase("RONALDO"));

        //trim "Elimina espacios en blanco (solo al princio y final)"
        System.out.println("  Hola, me llamo  Ronaldo  ".trim());

        //Replace
        System.out.println(" Hola, soy    Ronaldo  y estoy usando JAVAAA  ".trim().replace("  ", ""));

        // Alternativo a la interpolacion "concatenar" = Format (%s"srting", %d"int" %f"float")
        var age = 37;
        System.out.println(String.format("Hola, soy %s. Tengo %d", name, age));

    }
}
