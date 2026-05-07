public class ThaiFood extends MenuItem{

    public ThaiFood(String name, double price) {
        super(name, price);
    }

    private double sumPrice(int quantity){
        if(quantity == 0) return 0;
        return price + sumPrice(quantity-1);
    }

    @Override
    public double calculateDiscountedPrice(int quantity) {
        double total = sumPrice(quantity);
        if (quantity > 3) {
            total = total * 0.90; // ลด 10%
        }
        return total;
    }
 
    @Override
    public String toString() {
        return name + " (ThaiFood)";
    }
}
