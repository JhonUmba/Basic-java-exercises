package Topics.cycles.DoWhile;

import java.util.Scanner;

public class DoWhileNumberNegative {
    public static void main(String[] args) {
        int n;
        int acc = 0;

        //Methods
        Scanner scanner = new Scanner(System.in);

        //Do-While //Pide al usuario una sola vez que registre un valor
        do {
            System.out.println("El valor es: ");
            n = scanner.nextInt();
            acc++;
        }while (n >= 0);
        if (n < 0){
            System.out.println("El valor es: "+ acc);
        }
    }
}
