package functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Funtions {
    public static void main(String[] args) {
        //Funciones
//        for (int index = 0; index < 5; index++){
//            sendEmail();
//        }
        //...
        sendEmail();

        sendEmailToUser("roberto@gmail.com", "Rooberto");

       var users = new ArrayList<>(Arrays.asList("Teres", "Ronal", "Fer"));

       sendEmailToUser(users);

       var state = sendEmailWithState("ronal@gmail.com");
        System.out.println(state);
        System.out.println(sendEmailWithState(""));
    }

    //Funcion sin parametros ni retornos
    public static void sendEmail(){
        System.out.println("Se envia correctamente el email");
    }

    public  static  void sendEmailToUser(String email){
        System.out.println(" se enviado el email a "  + email );
    }

    // sobrecarga de funciones

    public  static  void sendEmailToUser(String email, String name){
        System.out.println(" se enviado el email a "  + name  + " " + email );
    }

    public  static  void sendEmailToUser(ArrayList<String> emails){ // -> Esto es una sobre carga de funcion
        for (String email: emails){
            System.out.println("Se envio el email a " + email);
        }

    }

    // funciones retornadas

    public static boolean sendEmailWithState(String email){
        if (email.isEmpty()){
            return false;
        }
        System.out.println("Se mando el mesnaje a " + email);
        return true;
    }
}
