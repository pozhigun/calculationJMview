package ru.pozhigun.alphabet;

public class ConvertToRoman extends Alphabet {

    public String convert(int number) {
        int l = getMap().floorKey(number);

        if (number == l) {
            return getMap().get(number);
        }

        return getMap().get(l) + convert(number - l);
    }

    public static boolean isArabic(String example) {
        return example.contains("1") ||
                example.contains("2") ||
                example.contains("3") ||
                example.contains("4") ||
                example.contains("5") ||
                example.contains("6") ||
                example.contains("7") ||
                example.contains("8") ||
                example.contains("9") ||
                example.contains("0");
    }

}