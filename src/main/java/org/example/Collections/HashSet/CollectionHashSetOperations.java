package org.example.Collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSetOperations {
    public static void main(String[] args) {
        Set<String> pcGames = new HashSet<>();
        pcGames.add("dota2");
        pcGames.add("Special Force Rush");
        pcGames.add("mir4");
        pcGames.add("life is strange");

        System.out.println("Our original set of pcGames: " + pcGames);


        System.out.println("-------------");
        Set<String> newpcGames = new HashSet<>();
        newpcGames.add("Diablo");
        newpcGames.add("Stray");
        newpcGames.add("Roblox");
        newpcGames.add("Final Fantasy");

        pcGames.addAll(newpcGames);
        System.out.println("After the new games arrived: " + pcGames);

        System.out.println("-----------");

        Set<String> popularPcGames = new HashSet<>();
        popularPcGames.add("Call of Duty");
        popularPcGames.add("life is strange");
        popularPcGames.add("Stray");
        popularPcGames.add("dota2");
        System.out.println("Most popular games in 2023:  " +
                pcGames.containsAll(popularPcGames));

        pcGames.retainAll(popularPcGames);
        System.out.println("The popular games in 2024: " + pcGames);

        pcGames.removeAll(popularPcGames);
        System.out.println("After the popular games in 2024: " + pcGames);

    }
}
