package Ejemplos;
import java.util.Scanner;



    public class Informacion {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Ingresa tu nombre");
            String N1 = input.next();

            System.out.println("Ingresa tu Nº cedula");
            int CC = input.nextInt();

            System.out.println("Ingresa tu edad");
            int A = input.nextInt();

            System.out.println();

            System.out.println("Estas en el grupo de egresados felicidades !!");

        }
    }
