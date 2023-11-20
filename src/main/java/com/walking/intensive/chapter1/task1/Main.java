package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 14;

        System.out.println(getAgeString(age));

    }

    static String getAgeString(int age) {
        Integer preLastDigit = age % 100 / 10;
        Integer lastDigit = age % 10;
        if ((preLastDigit == 1) && (lastDigit >= 1 && lastDigit <= 4)) {
            return (age + "лет");
        }


        switch (lastDigit) {
            case 1:
                return (age + "год");
            case 2:
            case 3:
            case 4:
                return (age + "года");
            default:
                return (age+"лет");
        }
    }
}