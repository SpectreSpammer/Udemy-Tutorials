package org.example.Collections.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionLinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, Double> ramPriceHashMap = new HashMap<>();
        ramPriceHashMap.put("TFORCE",4500.00);
        ramPriceHashMap.put("GSKILL", 6700.00);
        ramPriceHashMap.put("CORSAIR", 5300.00);
        ramPriceHashMap.put("PNY", 3900.00);

        System.out.println("Hashmap:");
        for(String ram : ramPriceHashMap.keySet()){
            System.out.println(ram + " PHP" + ramPriceHashMap.get(ram));
        }

        System.out.println("----------------");

        System.out.println("LinkedHashMap");
        Map<String, Double> ramPriceLinkedHashMap = new LinkedHashMap<>();
        ramPriceLinkedHashMap.put("TFORCE",4500.00);
        ramPriceLinkedHashMap.put("GSKILL", 6700.00);
        ramPriceLinkedHashMap.put("CORSAIR", 5300.00);
        ramPriceLinkedHashMap.put("PNY", 3900.00);

        for(String ram : ramPriceLinkedHashMap.keySet()){
            System.out.println(ram + " PHP" + ramPriceLinkedHashMap.get(ram));
        }
        System.out.println("--------------");


        System.out.println("TreeMap:");
        Map<String, Double> ramPriceTreeMap = new TreeMap<>();
        ramPriceTreeMap.put("TFORCE",4500.00);
        ramPriceTreeMap.put("GSKILL", 6700.00);
        ramPriceTreeMap.put("CORSAIR", 5300.00);
        ramPriceTreeMap.put("PNY", 3900.00);
//        ramPriceTreeMap.put(null, 3900.00);

        for(String ram : ramPriceTreeMap.keySet()){
            System.out.println(ram + " Php" + ramPriceTreeMap.get(ram));
        }

    }
}
