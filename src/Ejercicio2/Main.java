package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        HiloCorredor juan = new HiloCorredor("Juan");
        HiloCorredor pedro = new HiloCorredor("Pedro");
        HiloCorredor ana = new HiloCorredor("Ana");
        HiloCorredor carlos = new HiloCorredor("Carlos");

        try {
            

            System.out.println("Estado inicial de los hilos: ");
            System.out.println(juan.getName() + ": " + juan.getState());
            System.out.println(pedro.getName() + ": " + pedro.getState());
            System.out.println(ana.getName() + ": " + ana.getState());
            System.out.println(carlos.getName() + ": " + carlos.getState());

            juan.start();
            pedro.start();
            ana.start();
            carlos.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Proximo estado de los hilos: ");
        System.out.println(juan.getName() + ": " + juan.getState());
        System.out.println(pedro.getName() + ": " + pedro.getState());
        System.out.println(ana.getName() + ": " + ana.getState());
        System.out.println(carlos.getName() + ": " + carlos.getState());

    }
}
