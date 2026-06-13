package Ejercicio3;
import java.util.Scanner;
public class ValidacionEdad {

    Scanner scanner = new Scanner(System.in);
    
    public void preguntarEdad(){
        int edad = scanner.nextInt();

        try{
            EdadInvalidaException.validarEdad(edad);
        }catch(EdadInvalidaException e){
            System.out.println(e.getMessage());
        }
        
    }
}
