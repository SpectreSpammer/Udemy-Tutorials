package org.example.Collections.HashSet;

import java.util.EnumSet;

public class CollectionEnumSet {

    enum MetroManila{
        LAS_PINAS, PARANAQUE ,MUNTINLUPA, TAGUIG
    }

    public static void main(String[] args) {
        EnumSet<MetroManila> metroManila = EnumSet.allOf(MetroManila.class);
        System.out.println("Metro Manila shipping locations: " + metroManila);


        EnumSet<MetroManila> metroManila2 = EnumSet.noneOf(MetroManila.class);
        metroManila2.add(MetroManila.LAS_PINAS);
        metroManila2.add(MetroManila.PARANAQUE);
        metroManila2.add(MetroManila.MUNTINLUPA);
        System.out.println("Metro Manila shipping locations: " + metroManila2);


        EnumSet<MetroManila> metroManila3 = EnumSet.of(
                MetroManila.PARANAQUE,
                MetroManila.TAGUIG);
        System.out.println("Metro Manila shipping locations: " + metroManila3);


        EnumSet<MetroManila> metroManila4 = EnumSet.range(
                MetroManila.PARANAQUE,
                MetroManila.TAGUIG);
        System.out.println("Metro Manila shipping locations: " + metroManila4);

    }
}
