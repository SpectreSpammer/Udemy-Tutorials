package org.example.Collections.HashTable;

import java.util.Hashtable;
import java.util.TreeMap;

public class CollectionHashTable {
    public static void main(String[] args) {
        Hashtable<String, Double> ramPriceHashTable = new Hashtable<>();
        ramPriceHashTable.put("TFORCE", 4500.00);
        ramPriceHashTable.put("GSKILL", 6700.00);
        ramPriceHashTable.put("CORSAIR", null);
        ramPriceHashTable.put(null, 0.0);
        ramPriceHashTable.put("DELTA", 4950.00);
    }
}
