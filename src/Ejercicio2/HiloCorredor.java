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
        System.out.println(mostrarEstadoActual());
  
    }

    public String mostrarEstadoActual(){

        if (getState() == Thread.State.NEW)
            return getName() + ": Nuevo.";
        else if (getState() == Thread.State.RUNNABLE)
            return getName() + ": Corriendo.";
        else if(getState() == Thread.State.TERMINATED)
            return getName() + ": Muerto. ";
        else if(getState() == Thread.State.TIMED_WAITING)
            return (getName() + ": Esperando.");
        else if(getState() == Thread.State.BLOCKED)
            return getName() + ": Bloqueado.";
        else
            return getName() + ": Indefinido. ";

    }
    
}
