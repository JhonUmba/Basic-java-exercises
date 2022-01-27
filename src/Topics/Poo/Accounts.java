package Topics.Poo;

public class Accounts {
    //Atributos
    String nProduct;
    String size;
    String direction;
    String color;
    int amount;

    //Motodo constructor

    public Accounts(String nProduct, String size, String direction, String color, String amount) {
        this.nProduct = nProduct;
        this.size = size;
        this.direction = direction;
        this.color = color;
        this.amount = Integer.parseInt(amount);
    }
    //Metodos getter y setter


    public String getnProduct() {
        return nProduct;
    }

    public String getSize() {
        return size;
    }

    public String getDirection() {
        return direction;
    }

    public String getColor() {
        return color;
    }

    public int getAmount() {
        return amount;
    }

    public void setnProduct(String nProduct) {
        this.nProduct = nProduct;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //Mostrar Informacion
    public void showInfo() {
        System.out.println("La informacion de su compra es: ");
        System.out.println("Nombre del producto: " + getnProduct());
        System.out.println("Tamaño : " + getSize());
        System.out.println("Direccion: " + getDirection());
        System.out.println("Color: " + getColor());
        System.out.println("Cantidad: " + getAmount());
        System.out.println();

    if(amount >=20){
        System.out.println("La cantidad de productos NO esta disponible " + amount);
    }else{
        System.out.println("La cantidad de productos esta disponible ");
         }
    }

}
