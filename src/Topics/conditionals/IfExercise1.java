package Topics.conditionals;

public class IfExercise1 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 13;

        if (num1 >= num2){

            if(num1==num2){
                System.out.println("El numero "+num1+"es igual al numero"+num2);
            }else{
                System.out.println("El numero"+num1+"es menor al numero"+num2);
            }


        }else{
            System.out.println("El numero "+num1+" es mayor al numero "+num2);
        }

    }
}