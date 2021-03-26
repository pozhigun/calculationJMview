package ru.pozhigun;

import ru.pozhigun.alphabet.ConvertToArabic;
import ru.pozhigun.alphabet.ConvertToRoman;
import ru.pozhigun.exception.VariableException;

public class Checkout {

    public static void checkNumber(int a, int b) {
        if (a > 10 || b > 10) {
            try {
                throw new VariableException();
            } catch (VariableException e) {
                System.out.println("Число не может быть > 10");
                System.exit(0);
            }
        }
    }

    public static void checkNumber(String example) {
        if (ConvertToArabic.isRoman(example) && ConvertToRoman.isArabic(example)) {
            try {
                throw new VariableException();
            } catch (VariableException e) {
                System.out.println("Нельзя использовать римские и арабские одновременно!");
                System.exit(0);
            }
        }
    }

}
