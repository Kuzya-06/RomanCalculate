public class RomanArray {

   public String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

   public String[] romanC = new String[4001];

    {

        for (int i = 0; i < 101; i++) {
            romanC[i] = roman[i];
            System.out.println(i + "  - " + romanC[i]);
        }
        for (int i = 101; i < 201; i++) {
            romanC[i] = "C" + romanC[i - 100];
            System.out.println(i + "  - " + romanC[i]);
        }
        for (int i = 201; i < 301; i++) {
            romanC[i] = "C" + romanC[i - 100];
            System.out.println(i + "  - " + romanC[i]);
        }
        for (int i = 301; i < 400; i++) {
            romanC[i] = "C" + romanC[i - 100];
            System.out.println(i + "  - " + romanC[i]);
        }

        romanC[400] = "CD";
        for (int i = 401; i < 500; i++) {
            romanC[i] = "CD" + romanC[i - 400];
            System.out.println(i + "  - " + romanC[i]);
        }

        romanC[500] = "D";
        for (int i = 501; i < 600; i++) {
            romanC[i] = "D" + romanC[i - 500];
            System.out.println(i + "  - " + romanC[i]);
        }
        for (int i = 600; i < 700; i++) {
            romanC[i] = "D" + romanC[i - 500];
            System.out.println(i + "  - " + romanC[i]);
        }
        for (int i = 700; i < 800; i++) {
            romanC[i] = "D" + romanC[i - 500];
            System.out.println(i + "  - " + romanC[i]);
        }
        for (int i = 800; i < 900; i++) {
            romanC[i] = "D" + romanC[i - 500];
            System.out.println(i + "  - " + romanC[i]);
        }

        romanC[900] = "CM";
        for (int i = 901; i < 1000; i++) {
            romanC[i] = "CM" + romanC[i - 900];
            System.out.println(i + "  - " + romanC[i]);
        }

        romanC[1000] = "M";
        for (int i = 1001; i < 4000; i++) {
            romanC[i] = "M" + romanC[i - 1000];
            System.out.println(i + "  - " + romanC[i]);
        }

        romanC[4000] = "MY";
    }
}
