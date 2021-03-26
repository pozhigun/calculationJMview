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
                ConsoleHelper.writeConsole("Число не может быть > 10");
                System.exit(0);
            }
        }
    }

    public static void checkNumber(String example) {
        if (ConvertToArabic.isRoman(example) && ConvertToRoman.isArabic(example) ||
                !ConvertToArabic.isRoman(example) && !ConvertToRoman.isArabic(example)) {
            try {
                throw new VariableException();
            } catch (VariableException e) {
                ConsoleHelper.writeConsole("Нельзя использовать римские и арабские одновременно!");
                ConsoleHelper.writeConsole("Неправильно значение! Пример: 2+2");
                System.exit(0);
            }
        }
    }

}
