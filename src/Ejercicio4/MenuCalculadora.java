package Ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCalculadora {

    static Scanner scanner = new Scanner(System.in);
    
    public static void menuOperacionesDisponibles(){
        int opcion = 0;

        do{
            System.out.println("[     CALCULADORA     ]");
            System.out.println("=======================");
            System.out.println("1. Suma                ");
            System.out.println("2. Resta               ");
            System.out.println("3. Multiplicacion      ");
            System.out.println("4. Division            ");
            System.out.println("5. Salir          ");
            System.out.println("=======================");
            System.out.println("\nDigite el numero de la opcion que desea elegir: ");
            
            try{
                opcion = scanner.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Error: Digite un numero valido.");
                scanner.nextLine();
                continue;
            }

            switch(opcion){
                case 1:{
                    System.out.println("\n[SUMA]");
                    try{
                        System.out.println("Ingrese el primer numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        double num2 = scanner.nextDouble();

                        System.out.println(CalculadoraSegura.suma(num1, num2));

                    }catch(InputMismatchException e){
                        System.out.println("Error: Debe digitar un numero valido. ");
                    }
                    finally{
                        System.out.println("Proceso finalizado. ");
                    }
                    break;

                }
                case 2:{
                    System.out.println("\n[RESTA]");
                    try{
                        System.out.println("Ingrese el primer numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        double num2 = scanner.nextDouble();

                        System.out.println(CalculadoraSegura.resta(num1, num2));

                    }catch(InputMismatchException e){
                        System.out.println("Error: Debe digitar un numero valido. ");
                    }
                    finally{
                        System.out.println("Proceso finalizado. ");
                    }
                    break;
                }
                case 3:{
                    System.out.println("\n[MULTIPLICACION]");
                    try{
                        System.out.println("Ingrese el primer numero: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        double num2 = scanner.nextDouble();

                        System.out.println(CalculadoraSegura.multiplicacion(num1,num2));

                    }catch(InputMismatchException e){
                        System.out.println("Error: Debe digitar un numero valido. ");
                    }
                    finally{
                        System.out.println("Proceso finalizado. ");
                    }
                    break;
                }
                case 4:{
                    System.out.println("\n[DIVISION]");
                    try{
                        System.out.println("Ingrese el primer numero: ");
                        double dividendo = scanner.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        double divisor = scanner.nextDouble();

                        System.out.println(CalculadoraSegura.division(dividendo, divisor));

                    }catch(ArithmeticException e){
                        e.getMessage();
                    }
                    finally{
                        System.out.println("Proceso finalizado. ");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    System.out.println("Error: Opcion invalida.");
                    break;
                }

            }



        }while(opcion !=5);
    }
}
