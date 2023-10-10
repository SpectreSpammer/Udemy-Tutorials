package org.example.Collections.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("FSP", 6500.00, "750 watts gold"));
        listOfProducts.add(new Product("PNY", 4900, "XLR8 16x2"));
        listOfProducts.add(new Product("MSI", 9500, "B660M PRO WIFI"));

        listOfProducts.add(1, new Product("INTEL", 15000.00, "i7-13900K"));
        listOfProducts.remove(2);
        listOfProducts.remove(new Product("PNY", 4900, "XLR8 16x2"));
        listOfProducts.set(0, new Product("FSP,", 9999.00, "1000 watts platinum"));
//        System.out.println(listOfProducts);


        for(Product product : listOfProducts){
            System.out.println(product);
        }

        System.out.println("The third element in the list:");
        System.out.println(listOfProducts.get(2));

        System.out.println(listOfProducts.size() + " products can be found in the list");
    }

}
