package org.example;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingSupport {

    public static void main(String[] args) {
        /*
          Se agrega un método de factory NumberFormatpara formatear
          números en forma compacta y legible por humanos de acuerdo
          con el estándar Unicode.
          resultado: 1K 100K 1M
         */
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));

        /*
            El LONGformato en Japones en lugar de inglés:
         */
        NumberFormat fmt2 = NumberFormat.getCompactNumberInstance(Locale.forLanguageTag("ja"), NumberFormat.Style.LONG);
        System.out.println(fmt2.format(1000));
        System.out.println(fmt2.format(100000));
        System.out.println(fmt2.format(1000000));
    }
}
