package Topics.cycles.For;

import javax.swing.*;
import java.util.Scanner;

public class ForExercise1 {
    public static void main(String[] args) {
        int Con;

        Con = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor:"));
        System.out.println("Los valores son: ");

        Con++;
        for (int i=0; i<=Con; i+=2){
            System.out.println(i);
        }

        System.out.println("Resultado final "+Con);
    }
}
