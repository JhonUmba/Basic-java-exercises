package Topics.cycles.DoWhile;
import java.util.Scanner;

public class DoWhile {
public static void main(String[]args){
    int n;
    int sum = 0;

    Scanner scanner = new Scanner(System.in);

    //Do-While
    do{
        System.out.println("Ingresa el valor: ");
        n = scanner.nextInt();
        sum += n;
    }while (n != 0);
    System.out.println("total de valores ingresados "+sum);

    }
}