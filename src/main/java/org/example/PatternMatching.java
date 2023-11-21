package org.example;
import org.example.models.GrapeClass;

import java.awt.*;

public class PatternMatching {
    public static void main(String[] args) {
        oldAndNewStyle();
    }

    private static void oldAndNewStyle() {
        Object o = new GrapeClass(Color.BLUE, 2);
        System.out.println("--------Old Style Java 11-----------");
        if (o instanceof GrapeClass) {
            GrapeClass grape = (GrapeClass) o;
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
        System.out.println("--------New Style Java 17-----------");
        if (o instanceof GrapeClass grape) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
        //solo funciona con "&&" no con "||" por que la segunda condicion solo la evaluara
        // en caso de que o instanceof GrapeClass grape sea TRUE
        if (o instanceof GrapeClass grape && grape.getNbrOfPits() == 2) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }

        if (!(o instanceof  GrapeClass grape)) {
            throw new RuntimeException();
        }
        System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");

    }
}
