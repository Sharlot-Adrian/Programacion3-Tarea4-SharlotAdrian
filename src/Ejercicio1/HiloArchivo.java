package Ejercicio1;

public class HiloArchivo extends Thread {

    public HiloArchivo(String nombreArchivo){
        super(nombreArchivo);
    }

    @Override
    public void run(){
        for (int i = 0; i <=100; i++){
            
            if (i == 0)
                System.out.println("Descargando Archivo "+ getName());

            System.out.println(getName() + " " + i + "% " );

            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " completado.");
    }
    
}
