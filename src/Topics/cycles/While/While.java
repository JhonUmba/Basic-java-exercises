package Topics.cycles.While;

import javax.swing.*;

public class While {
    public static void main(String[]args){
        int v;

         //Ventana emergente
         v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor: "));

        //While
        while (v !=0){
              if (v %2 ==0){
               System.out.println("El valor es: "+v+" Par");
             }else {
              System.out.println("El valor es:"+v+" Impar");
            }
            v = Integer.parseInt(JOptionPane.showInputDialog("El valor es: "));
        }
    }
}