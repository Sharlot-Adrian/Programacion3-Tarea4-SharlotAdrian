package Ejercicio1;

public class Main {

    public static void main(String args []){

    
        HiloArchivo archivo1 = new HiloArchivo("Archivo1");
        HiloArchivo archivo2 = new HiloArchivo("Archivo2");
        HiloArchivo archivo3 = new HiloArchivo("Archivo3");

        archivo3.start();
        archivo2.start();
        archivo1.start();
        
    }
    
    
}
