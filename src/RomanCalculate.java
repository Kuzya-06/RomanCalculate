import java.util.Scanner;

public class RomanCalculate {
    public static void main(String[] args) {
        RomanArray RAT = new RomanArray();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("¬ведите арабское число: ");
            int x = sc.nextInt();
            if (x >= 0 && x <= 4000)
                //     System.out.println("Roman Digit = " + new RomanArray().romanC[x]);
                System.out.println("„исло - " + x +" = "+RAT.romanC[x] +" - Roman numeral " );
            else {
                try {
                    throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("¬ведите от 0 до 4000 !!!");
                }
            }
        }

    }
}