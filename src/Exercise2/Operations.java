package Exercise2;

import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //OPERACION A
        System.out.println("Ingresar dato 1: ");
        int dato1 = input.nextInt();

        System.out.println("Ingresar dato 2: ");
        int dato2 = input.nextInt();

        System.out.println("Ingresar dato 3: ");
        int dato3 = input.nextInt();

        int ResultadoA = (dato1+dato2*dato3);

        System.out.println("Resultado operacion A:"+ResultadoA);
        System.out.println();

        //OPERACION B

        System.out.println("Ingresar dato 1: ");
        int D1 = input.nextInt();

        System.out.println("Ingresar dato 2: ");
        int D2 = input.nextInt();

        System.out.println("Ingresar dato 3: ");
        int D3 = input.nextInt();

        int ResultadoB = (D1+D2)%D3;

        System.out.println("Resultado operacion B: "+ResultadoB);
        System.out.println();

        //OPERACION C

        System.out.println("Ingresar dato 1: ");
        int d1 = input.nextInt();

        System.out.println("Ingresar dato 2: ");
        int d2 = input.nextInt();

        System.out.println("Ingresar dato 3: ");
        int d3 = input.nextInt();

        System.out.println("Ingresar dato 4: ");
        int d4 = input.nextInt();

        int ResultadoC = (d1+d2*d3/d4);

        System.out.println("Resultado operacion C: "+ResultadoC);
        System.out.println();

        //OPERACION D

        System.out.println("Ingresar dato 1: ");
        int da1 = input.nextInt();

        System.out.println("Ingresar dato 2: ");
        int da2 = input.nextInt();

        System.out.println("Ingresar dato 3: ");
        int da3 = input.nextInt();

        System.out.println("Ingresar dato 4: ");
        int da4 = input.nextInt();

        System.out.println("Ingresar dato 5: ");
        int da5 = input.nextInt();

        System.out.println("Ingresar dato 6: ");
        int da6 = input.nextInt();

        int ResultadoD = (da1+da2/da3*da4-da5/da6);

        System.out.println("Resultado de operacion D: "+ResultadoD);


    }
}
