/*
* Ciclo do while
* do{
*       Instrucciones;
* }while(condicion);
* */

package Topics.cycles.DoWhile;

import java.util.Scanner;

public class DoWhileExercise1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=1, contador;

        System.out.println("Ingrese la cantidad que desee imprimir: ");
        contador = entrada.nextInt();

        do{
            System.out.println(i);
            i+=3;
        }while(i <= contador);

    }
}
