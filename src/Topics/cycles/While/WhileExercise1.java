package Topics.cycles.While;

import javax.swing.*;

public class WhileExercise1 {
    public static void main(String[] args) {
        int n1;

        //Metodo
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"));

        while (n1!= 0){

            if (n1 %2 == 0){
                System.out.println("El numero "+n1+" es par");
            }else{
                System.out.println("El numero "+n1+" es impar");
            }


            n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"));
        }
    }
}
