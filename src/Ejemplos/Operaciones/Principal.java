package Ejemplos.Operaciones;

public class Principal {
    public static void main(String[] args) {
        int resultado = sumar (2,4);
        System.out.println("El resultado de la suma  es: " + resultado);

        float res2 = Operacion.multiplicar(2,16);
        System.out.println("El resultado de la multiplicacion es: " + res2);
    }

    private static int sumar (int varX, int varY){
        return varX + varY;
    }

}
