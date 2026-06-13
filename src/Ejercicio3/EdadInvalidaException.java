package Ejercicio3;

public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }

    public static void validarEdad(int edad) throws EdadInvalidaException{

        if (edad < 18)
            throw new EdadInvalidaException("Debe ser mayor de edad.");
    } 
    
}
