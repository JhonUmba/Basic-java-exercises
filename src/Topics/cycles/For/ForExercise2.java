/*
* Ciclo for
*
* for(inicializacion ; condicion ; aumento o decremento){
*       Instrucciones;
* }
*
*
* */

package Topics.cycles.For;

import java.util.Scanner;

public class ForExercise2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador;

        System.out.println("Igrese la cantidad que desea imprimir: ");
        contador = entrada.nextInt();


        for (int i=1; i<=contador; i++){
            System.out.println(i);
        }

    }
}
