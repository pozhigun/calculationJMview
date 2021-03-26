package ru.pozhigun;

import ru.pozhigun.alphabet.ConvertToArabic;
import ru.pozhigun.alphabet.ConvertToRoman;

public class Main {

    private static boolean isRoman;

    private static final ConvertToArabic arabic = new ConvertToArabic();
    private static final ConvertToRoman roman = new ConvertToRoman();

    public static void main(String[] args) {

        ConsoleHelper.writeConsole("Введите пример: ");
        String example = ConsoleHelper.readConsole().toUpperCase().replaceAll(" ", "");
        isRoman = ConvertToArabic.isRoman(example);
        String result = "";
        Checkout.checkNumber(example);

        if (example.contains("+")) {
            result = calculatePlus(example.split("\\+"));
        } else if (example.contains("-")) {
            result = calculateMinus(example.split("-"));
        } else if (example.contains("*")) {
            result = calculateMultiplication(example.split("\\*"));
        } else if (example.contains("/")) {
            result = calculateDivision(example.split("/"));
        }

        ConsoleHelper.writeConsole(result);
    }

    private static String calculatePlus(String[] example) {
        int result;
        if (isRoman) {
            result = arabic.convert(example[0]) + arabic.convert(example[1]);
            Checkout.checkNumber(arabic.convert(example[0]), arabic.convert(example[1]));
            return roman.convert(result);
        } else {
            result = Integer.parseInt(example[0]) + Integer.parseInt(example[1]);
            Checkout.checkNumber(Integer.parseInt(example[0]), Integer.parseInt(example[1]));
            return String.valueOf(result);
        }
    }

    private static String calculateMinus(String[] example) {
        int result;
        if (isRoman) {
            result = arabic.convert(example[0]) - arabic.convert(example[1]);
            Checkout.checkNumber(arabic.convert(example[0]), arabic.convert(example[1]));
            return roman.convert(result);
        } else {
            result = Integer.parseInt(example[0]) - Integer.parseInt(example[1]);
            Checkout.checkNumber(Integer.parseInt(example[0]), Integer.parseInt(example[1]));
            return String.valueOf(result);
        }
    }

    private static String calculateMultiplication(String[] example) {
        int result;
        if (isRoman) {
            result = arabic.convert(example[0]) * arabic.convert(example[1]);
            Checkout.checkNumber(arabic.convert(example[0]), arabic.convert(example[1]));
            return roman.convert(result);
        } else {
            result = Integer.parseInt(example[0]) * Integer.parseInt(example[1]);
            Checkout.checkNumber(Integer.parseInt(example[0]), Integer.parseInt(example[1]));
            return String.valueOf(result);
        }
    }

    private static String calculateDivision(String[] example) {
        int result;
        if (isRoman) {
            result = arabic.convert(example[0]) / arabic.convert(example[1]);
            Checkout.checkNumber(arabic.convert(example[0]), arabic.convert(example[1]));
            return roman.convert(result);
        } else {
            result = Integer.parseInt(example[0]) / Integer.parseInt(example[1]);
            Checkout.checkNumber(Integer.parseInt(example[0]), Integer.parseInt(example[1]));
            return String.valueOf(result);
        }
    }
}
