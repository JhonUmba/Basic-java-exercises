package Topics.conditionals;

public class ConditionIf {
    public static void main(String[] args) {
        //Variables
        int n1 = 69;
        int n2 = 68;

        //Condicion
        if (n1 >= n2){

            if (n1 == n2){
                System.out.println("El numero "+n1+" es igual al numero "+n2);
            }else{
                System.out.println("El numero "+n1+" es mayor al numero "+n2);
            }
        }
        else{
            System.out.println("El numero "+n1+" es menor al numero "+n2);
        }

    }
}
