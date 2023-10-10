package org.example.Collections.HashSet;

import java.util.TreeSet;

public class CollectionTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ramBrands = new TreeSet<>();
        ramBrands.add("Teamgroup");
        ramBrands.add("Corsair");
        ramBrands.add("Gskill");
        ramBrands.add("Crucial");
        ramBrands.add("PNY");
        ramBrands.add("Kingston");
        System.out.println("Our original set of Ram Brands: " + ramBrands);

        System.out.println("-----------");
        System.out.println("Lower function returns the ff: " + ramBrands.lower("Crucial"));
        System.out.println("Floor function returns the ff: " + ramBrands.floor("Crucial"));
        System.out.println("Higher function returns the ff: " + ramBrands.higher("Crucial"));
        System.out.println("Ceiling function returns the ff: " + ramBrands.ceiling("Crucial"));

        System.out.println("----------");
        System.out.println("Tail set: " + ramBrands.tailSet("Corsair"));
        System.out.println("Head set: " + ramBrands.headSet("Corsair"));
        System.out.println("Sub set: " + ramBrands.subSet("Corsair","Crucial"));

        System.out.println("----------------");
        System.out.println("The first element: " + ramBrands.first());
        System.out.println("The last element: " + ramBrands.last());
        System.out.println("The pollFirst element: " + ramBrands.pollFirst());
        System.out.println("The pollLast element: " + ramBrands.pollLast());
        System.out.println("The set after pollFirst and pollLast: " + ramBrands);

        System.out.println("The set in descending order: " + ramBrands.descendingSet());
    }
}
