package org.example;

import org.example.models.GrapeClass;

import java.awt.*;

public class Records {

    public static void main(String[] args) {
        oldAndNewStyle();
    }

    private static void oldAndNewStyle() {
        System.out.println("--------Old Style Java 11-----------");
        GrapeClass grape1 = new GrapeClass(Color.BLUE, 1);
        GrapeClass grape2 = new GrapeClass(Color.WHITE, 2);
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeClass grape1Copy = new GrapeClass(grape1.getColor(), grape1.getNbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy));

        System.out.println("--------New Style Java 17-----------");
        record GrapeRecord(Color color, int nbrOfPits) {}
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeRecord grape1Copy2 = new GrapeRecord(grape1.getColor(), grape1.getNbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy2));
    }
}
