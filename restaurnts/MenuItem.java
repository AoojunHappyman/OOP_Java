public abstract class MenuItem {
    
    protected String name;
    protected double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    // Recursion: คำนวณราคารวมทีละ 1 ชิ้น สะสมจนครบ quantity
    // ถ้า quantity > 3 → ราคารวมทั้งหมดลด 10%
    public abstract double calculateDiscountedPrice(int quantity);
}

