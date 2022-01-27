package Ejemplos;

public class Carro {
    //Atributos
    String color;
    String marca;
    String m;
    String combustible;

    //Metodo Constructor
    public Carro (String c, String ma, String mo, String com){
        this.color = c;
        this.marca = ma;
        this.m = mo;
        this.combustible = com;
    }
    //Getter
    public String getColor(){
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getMo() {
        return m;
    }

    public String getCombustible() {
        return combustible;
    }
    //Setter
    public void setColor(String c){
        this.color = c;
    }
    public void setMarca(String ma){
        this.marca = ma;
    }
    public void setMo(String m){
        this.m = m;
    }
    public void setCombustible(String com){
        this.combustible = com;
    }

    //Imprimir datos
    public void imprimir(){
        System.out.println("Informacion del carro: ");
        System.out.println("El color es: " + getColor());
        System.out.println("La marca es: "  + getMarca());
        System.out.println("El modelo es: " + getMo());
        System.out.println("El combustible es: " + getCombustible());
    }


}
