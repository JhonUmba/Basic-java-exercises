package Topics.cycles.While;

import java.util.Scanner;

public class WhileExercise3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1,contador;

        System.out.println("Inserte la cantidad de valores que quiere en pantalla: ");
        contador = entrada.nextInt();

        while (i <= contador){
            System.out.println(i);
            //i++; suma 1 en 1
            i+=2; //suma 2 en 2 o el valor que desee
        }
    }
}