import java.util.Scanner;

public class RomanCalculate {
    public static void main(String[] args) {
        RomanArray RAT = new RomanArray();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("������� �������� �����: ");
            int x = sc.nextInt();
            if (x >= 0 && x <= 4000)
                //     System.out.println("Roman Digit = " + new RomanArray().romanC[x]);
                System.out.println("����� - " + x +" = "+RAT.romanC[x] +" - Roman numeral " );
            else {
                try {
                    throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("������� �� 0 �� 4000 !!!");
                }
            }
        }

    }
}