package productFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductReader {
    public ArrayList<String> readProducts(String filename)throws IOException{
        ArrayList<String> products = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while((line = reader.readLine()) != null){
            products.add(line);
        }
        reader.close();
        return products;
    }
}
