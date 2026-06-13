package Ejercicio2;

public class HiloCorredor extends Thread {

    public HiloCorredor(String nombre){
        super(nombre);
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(getName() + " avanzo al metro " + i + ".");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " llego a la meta. ");
    
    }

    
}
