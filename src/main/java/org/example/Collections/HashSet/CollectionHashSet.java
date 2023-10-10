package org.example.Collections.HashSet;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class CollectionHashSet {
    public static void main(String[] args) {
        Set<String> pcGames = new HashSet<>();

        pcGames.add("mir4");
        pcGames.add("dota2");
        pcGames.add("Special Force Rush");
        pcGames.add("mir4");

        System.out.println(pcGames);


        pcGames.clear();
        pcGames.remove("dota2");
        System.out.println(pcGames);
        System.out.println("Dota 2 is in the set: " + pcGames.contains("dota2"));
        System.out.println("The size of the set: " + pcGames.size());

        for(String games : pcGames){
            System.out.println("--" + games.toUpperCase());
        }

    }
}
