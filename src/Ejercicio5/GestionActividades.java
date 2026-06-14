package Ejercicio5;
import java.io.*;
import java.util.Scanner;

public class GestionActividades {

    Scanner scanner = new Scanner(System.in);

    public void gestionarActividades(){

        File registro = new File("Actividades.txt");
        int opcion = 0;
        
        do{

            System.out.println("\n[          MENU         ]");
            System.out.println("===========================");
            System.out.println("1. Agregar actividad       ");
            System.out.println("2. Mostrar actividades     ");
            System.out.println("3. Salir                   ");
            System.out.println("===========================");

            System.out.println("\nIngrese el numero de la opcion que desea seleccionar: ");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:{

                    try{
                        FileWriter fr = new FileWriter("Actividades.txt", true);
                        BufferedWriter bw = new BufferedWriter(fr);

                        System.out.println("Ingrese una actividad: ");
                        String actividad = scanner.nextLine();
                        bw.write(actividad);
                        bw.newLine();
                        bw.close();


                    }catch(IOException e){
                        System.out.println("Error al intentar escribir en el archivo. ");
                    }
                    break;
                }
                case 2:{
                    try{
                        FileReader fr = new FileReader("Actividades.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String linea;
                        
                        while((linea = br.readLine()) != null){
                            System.out.println(linea);
                        }

                        br.close();

                    }catch(IOException e){
                        System.out.

                    }
                    break;
                }
                case 3:{
                    break;
                }
                default:{
                    break;
                }

            }

        }while(opcion !=3);
    }
}
