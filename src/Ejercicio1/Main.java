package Ejercicio1;

public class Main {

    try{
        HiloArchivo archivo1 = new HiloArchivo("Archivo1");
        HiloArchivo archivo2 = new HiloArchivo("Archivo2");
        HiloArchivo archivo3 = new HiloArchivo("Archivo3");

        archivo1.start();
    }
    catch(InterruptedException e){
    }

    
}
