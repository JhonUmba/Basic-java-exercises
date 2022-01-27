package Topics.cycles.For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int acc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor: ");
        acc = scanner.nextInt();
        acc++; //Contador de valores registrados //Suma cada dato ingresado

        //Inicializacion - Condicion - Aumento/Decremento
        for (int i=0; i<=acc; i+=4){
            System.out.println(i);
        }
        System.out.println("Registro final: "+acc);
    }
}
