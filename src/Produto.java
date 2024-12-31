public class Produto {

    private String name;
    private double price;
    private Integer quantity;

    public Produto(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double totalValue(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return "[name = " + name + ", totalValue = " + totalValue() + "]";
    }

    

}
