package Ejercicio3;
import java.util.Scanner;
public class ValidacionEdad {

    static Scanner scanner = new Scanner(System.in);
    
    public static void preguntarEdad(){

        System.out.println("Ingrese una edad: ");
        int edad = scanner.nextInt();

        try{
            EdadInvalidaException.validarEdad(edad);
        }catch(EdadInvalidaException e){
            System.out.println(e.getMessage());
        }

    }
}
