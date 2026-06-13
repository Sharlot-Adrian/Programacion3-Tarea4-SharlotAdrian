package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        HiloCorredor juan = new HiloCorredor("Juan");
        HiloCorredor pedro = new HiloCorredor("Pedro");
        HiloCorredor ana = new HiloCorredor("Ana");
        HiloCorredor carlos = new HiloCorredor("Carlos");
        
        System.out.println("Antes de la carrera: ");
        System.out.println(juan.getState());
        System.out.println(pedro.getState());
        System.out.println(ana.getState());
        System.out.println(carlos.getState());

        juan.start();
        pedro.start();
        ana.start();
        carlos.start();
    }
}
