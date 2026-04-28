package productFile;

import java.io.IOException;
import java.util.ArrayList;

public class ProductManager {
    public static void main(String[] args) {

        ProductReader reader = new ProductReader();

        try{
            ArrayList<String> products = reader.readProducts("stock.txt");

            System.out.println("รายการสินค้า:");
            for (String p : products) {
                System.out.println(p);
            }

            System.out.println("จำนวนสินค้าทั้งหมด: " + products.size() + " ชิ้น");
        }catch(IOException e){
            System.out.println("ไม่พบไฟล์สินค้า");
        }
    }
}
