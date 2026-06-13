package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        HiloCorredor juan = new HiloCorredor("Juan");
        HiloCorredor pedro = new HiloCorredor("Pedro");
        HiloCorredor ana = new HiloCorredor("Ana");
        HiloCorredor carlos = new HiloCorredor("Carlos");
        
        System.out.println("Antes de la carrera: ");
        System.out.println(juan.mostrarEstadoActual());
        System.out.println(pedro.mostrarEstadoActual());
        System.out.println(ana.mostrarEstadoActual());
        System.out.println(carlos.mostrarEstadoActual());

        juan.start();
        pedro.start();
        ana.start();
        carlos.start();
    }
}
