package Ejemplos;

import java.util.Scanner;

public class Adultos {
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;

        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese el Nombre: ");
        nombre = dato.nextLine();
        System.out.println("Ingrese la Edad: ");
        edad = dato.nextInt();

        if (edad >=18){
            System.out.println("El nombre es: " +nombre+ "(Mayor de Edad)");
        }else{
            System.out.println("El nombre es: " +nombre+"(Menor de Edad) !No puede votar¡");
        }
    }
}
