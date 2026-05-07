import java.util.*;

public class RestaurantOrder {
    public static double calculateTotalSales(Map<MenuItem,Integer> orderMap){
        double total = 0;
        for(Map.Entry<MenuItem,Integer> entry : orderMap.entrySet()){
            MenuItem item = entry.getKey();
            int quantity = entry.getValue();
            total += item.calculateDiscountedPrice(quantity);
        }
        return total;
    }

    public static void main(String[] args) {
        Map<String,List<MenuItem>> menuByCategory = new LinkedHashMap<>();

        List<MenuItem> thaiMenu = new ArrayList<>();
        thaiMenu.add(new ThaiFood("Fried Rice", 80));
        thaiMenu.add(new ThaiFood("Pad Thai", 90));
 
        List<MenuItem> japaneseMenu = new ArrayList<>();
        japaneseMenu.add(new JapaneseFood("Sushi", 150));
        japaneseMenu.add(new JapaneseFood("Ramen", 120));
 
        List<MenuItem> koreanMenu = new ArrayList<>();
        koreanMenu.add(new KoreanFood("Tteokbokki", 100));
        koreanMenu.add(new KoreanFood("Bibimbap", 110));

        menuByCategory.put("ThaiFood", thaiMenu);
        menuByCategory.put("JapaneseFood", japaneseMenu);
        menuByCategory.put("KoreanFood", koreanMenu);

        Map<MenuItem,Integer> order = new LinkedHashMap<>();

        MenuItem friedRice  = menuByCategory.get("ThaiFood").get(0);     // 80 บาท
        MenuItem sushi      = menuByCategory.get("JapaneseFood").get(0); // 150 บาท
        MenuItem tteokbokki = menuByCategory.get("KoreanFood").get(0);

        order.put(friedRice,  2);   // 80×2 = 160 (ไม่ลด)
        order.put(sushi,      4);   // 150×4 = 600 → ลด 10% = 540
        order.put(tteokbokki, 1);   // 100×1 = 100 (ไม่ลด)

        System.out.println("Order Summary:");
        for (Map.Entry<MenuItem, Integer> entry : order.entrySet()) {
            System.out.println("- " + entry.getKey() + " x " + entry.getValue());
        }
 
        // --- คำนวณและแสดงยอดรวม ---
        double totalSales = calculateTotalSales(order);
        System.out.println("\nTotal sales after discount: " + totalSales + " baht");
    }
}
