package org.example.Collections.HashMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class CollectionTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> ramPriceTreeMap = new TreeMap<>();
        ramPriceTreeMap.put("TFORCE", 4500.00);
        ramPriceTreeMap.put("GSKILL", 6700.00);
        ramPriceTreeMap.put("CORSAIR", 5300.00);
        ramPriceTreeMap.put("PNY", 3900.00);
        ramPriceTreeMap.put("DELTA", 4950.00);


        System.out.println("The first product in the map: " + ramPriceTreeMap.firstKey());
        System.out.println("TreeMap:");

        for(String ram : ramPriceTreeMap.keySet()){
            System.out.println(ram + " PHP" + ramPriceTreeMap.get(ram));
        }


        System.out.println("----------------");
        System.out.println("Descending Map:");
        NavigableMap<String, Double> ramPriceDescendingMap = ramPriceTreeMap.descendingMap();
        for (String ram : ramPriceDescendingMap.keySet()) {
            System.out.println(ram + " PHP" + ramPriceDescendingMap.get(ram));
        }

        System.out.println("----------------");
        System.out.println("Lower Key: " + ramPriceTreeMap.lowerKey("CORSAIR"));
        System.out.println("Floor Key: " + ramPriceTreeMap.floorKey("Hdd"));
        System.out.println("Higher Key: " + ramPriceTreeMap.higherKey("Hdd"));
        System.out.println("Ceiling Key: " + ramPriceTreeMap.ceilingKey("Hdd"));


        System.out.println("----------------");
        System.out.println("Poll first entry: " + ramPriceTreeMap.pollFirstEntry());
        System.out.println("The first entry: " + ramPriceTreeMap.firstEntry());
        System.out.println("The last entry: " + ramPriceTreeMap.lastEntry());

        System.out.println("Lower entry: " + ramPriceTreeMap.lowerEntry("Kingston"));
        System.out.println("Floor entry: " + ramPriceTreeMap.floorEntry("Kingston"));
        System.out.println("Higher entry: " + ramPriceTreeMap.higherEntry("Kingston"));
        System.out.println("Ceiling entry: " + ramPriceTreeMap.ceilingEntry("Kingston"));


        System.out.println("----------------");
        System.out.println("Tail Map: " + ramPriceTreeMap.tailMap("DELA",true));
        System.out.println("Head Map: " + ramPriceTreeMap.headMap("DELTA",true));
        System.out.println("Head Map: " + ramPriceTreeMap.subMap("CORSAIR",true,"PNY",true));




    }
}
