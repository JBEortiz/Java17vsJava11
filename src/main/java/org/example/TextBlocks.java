package org.example;

import org.example.models.Fruit;

public class TextBlocks {
    public static void main(String[] args) {
        jsonBlock();
        oldAndNewStyleWithoutBreak(Fruit.APPLE);

    }

    private static void jsonBlock() {

        String textJava11 = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
        System.out.println(textJava11);

        String textJav17 = """
            {
              "name": "John Doe",
              "age": 45,
              "address": "Doe Street, 23, Java Town"
            }
            """;
        System.out.println(textJav17);
    }

    private static void oldAndNewStyleWithoutBreak(Fruit fruit) {
        System.out.println("--------Old Style Java 11-----------");
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
                break;
            case AVOCADO:
                System.out.println("Exotic fruit");
                break;
            default:
                System.out.println("Undefined fruit");
        }

        System.out.println("--------New Style Java 17-----------");
        //in this case without the break
        switch (fruit) {
            case APPLE, PEAR -> System.out.println("Common fruit");
            case  AVOCADO -> System.out.println("Exotic fruit");
            default -> System.out.println("Undefined fruit");
        }
        //Another way
        String text = switch (fruit) {
            case APPLE, PEAR -> "Common fruit";
            case AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
        String textOneMore = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case  AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(textOneMore);

    }
}
