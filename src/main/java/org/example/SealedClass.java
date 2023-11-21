package org.example;

import org.example.models.AppleSealed;
import org.example.models.FruitSealed;
import org.example.models.PearSealed;

public class SealedClass {
    public static void main(String[] args) {
        sealedClasses();
    }
    private static void sealedClasses() {
        AppleSealed apple = new AppleSealed();
        PearSealed pear = new PearSealed();
        FruitSealed fruit = apple;
        class Avocado extends AppleSealed {};
    }
}
