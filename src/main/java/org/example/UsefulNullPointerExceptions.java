package org.example;

import org.example.models.GrapeClass;

import java.awt.*;
import java.util.HashMap;

public class UsefulNullPointerExceptions {

    public static void main(String[] args) {

        /*
            Con Java 11, la salida le mostrará el número de línea donde NullPointerExceptionocurre,
             pero no sabe qué método encadenado se resuelve null.
             Tienes que descubrirlo tú mismo mediante modo debug.

             Con Java 17, el mismo código da como resultado
             el siguiente resultado que muestra exactamente dónde
             NullPointerExceptionocurrió.
         */
        HashMap<String, GrapeClass> grapes = new HashMap<>();
        grapes.put("grape1", new GrapeClass(Color.BLUE, 2));
        grapes.put("grape2", new GrapeClass(Color.white, 4));
        grapes.put("grape3", null);
        var color = ((GrapeClass) grapes.get("grape3")).getColor();
        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "org.example.models.GrapeClass.getColor()" because the return value of "java.util.HashMap.get(Object)" is null
	at org.example.UsefulNullPointerExceptions.main(UsefulNullPointerExceptions.java:25)
         */
    }
}
