package String;

public class StringExercises {
    public static void main(String[] args) {
        // 1.- Concaten dos cadenas de texto
        String saludo = "Hola";
        String despedida = "adios";

        System.out.println(saludo + " " + despedida);

        // 2.- Muestra el primer y ultimo caracter
        String name = "Ronaldo Moctezuma";
        System.out.println(name.length());

        // 3.- Muestra el primer y ultimo caracter de un string
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() -1));

        //4.- convierte a mayusculas y minusculas un string
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //5.- Compureba si una cadena de texto contiene una palabra concreta
        System.out.println(name.contains("Moctezuma"));

        //6.- Formatea un string con un entero
        String lastname = "Moct3zuma";

        System.out.println(lastname.replace("3", "e"));

        //7.- Elimina los espacios en blanco de un string
        String juego = " ELDen   Ring  2";
        System.out.println(juego.trim().replace("  ", " ").toUpperCase());

        //8.- Sustituye todos los espacios en blanco al pricipio y final
        String amigo = " Noel Olvera ";
        System.out.println(amigo.trim());

        //9.- Comprueba si dos strings son iguales
        String sol = "Solaire";
        String luna = "Solaire";
        System.out.println(sol.equals(luna));

        //10.- Comprueba si dos strings tienen la misma logitud
        System.out.println(sol.length() == luna.length());
    }
}
