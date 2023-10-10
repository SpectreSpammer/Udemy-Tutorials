package org.example.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CollectionsHashMap {

    public static void main(String[] args) {
        Map<String, String> ddr4Ram = new HashMap<>();
        ddr4Ram.put("TFORCE","XTREEM ARGB 3200mhz 16x2");
        ddr4Ram.put("GSKILL","RIPJAWS V 3200mhz 16X2");
        ddr4Ram.put("CORSAIR", "DOMINATOR PLATINUM 3200mhz 16x2");
        ddr4Ram.put("PNY", "XLR8 3200mhz 16x2");

        System.out.println("The best productive ram for 2024 is :" + ddr4Ram.get("GSKILL"));
        ddr4Ram.remove("TFORCE","RIPJAWS V 3200mhz 16X2");
        System.out.println("The best productive cpu for 2024 is :" + ddr4Ram.get("TFORCE"));

        if(ddr4Ram.containsValue("DOMINATOR PLATINUM 3200mhz 16x2")){
            System.out.println("The best gaming cpu for 2024 is ");
        }

        ddr4Ram.put(null, "The RAM are out of stock");
        String userInput = "CORSAIR";
        if(ddr4Ram.containsKey(userInput)){
            System.out.println(ddr4Ram.get(userInput));

        }else {
            System.out.println(ddr4Ram.get(null));
        }

        System.out.println(ddr4Ram.getOrDefault(userInput,"The cpu is not on the list"));


        ddr4Ram.replace("CORSAIR","DOMINATOR PLATINUM 3200mhz 16x2", "3600mhz 32x2");
        System.out.println("Replacing the CORSAIR into " +ddr4Ram.get("CORSAIR"));

/*
         if(!ddr4Ram.containsKey(userInput)){
             ddr4Ram.put(userInput, "");

         }
        */

        ddr4Ram.putIfAbsent(userInput, "Trident Z Neo 3200mhz 16x2");
        ddr4Ram.remove(null);
        System.out.println(ddr4Ram.size() + "The ff rams can be found in the hashmap: ");
        for (String ddr4 : ddr4Ram.keySet()){
            System.out.println("--" + ddr4);
        }

        System.out.println("-----------");
        ddr4Ram.clear();
        System.out.println(ddr4Ram.size() + " rams can be found in the hashmap: ");
        for (String ddr4 : ddr4Ram.values()){
            System.out.println("--" + ddr4);
        }


    }
}
