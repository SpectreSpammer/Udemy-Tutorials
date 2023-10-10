package org.example.Collections.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionLinkedHashSet {
    public static void main(String[] args) {
        Set<String> pcGames = new LinkedHashSet<>(01,0.6f);
        pcGames.add("dota2");
        pcGames.add("Special Force Rush");
        pcGames.add("mir4");
        pcGames.add("life is strange");

        System.out.println("Our original set of pcGames: " + pcGames);
    }
}
