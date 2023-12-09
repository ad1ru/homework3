import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {12.2, 14.1, -2.1, -9.6, 21.1, 51.2, 1.2, 9.9, 91.5, -10.5, 47.2, 5.1, 6.4, -33.3, 3.9};

        boolean afterNegative = false;
        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (afterNegative && number > 0) {
                sum += number;
                count++;
            } else if (number < 0) {
                afterNegative = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println(Arrays.toString(numbers) + "=" + average + "/" + count);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        String processedString = processString(inputString);

        boolean isPalindrome = checkPalindrome(processedString);

        if (isPalindrome) {
            System.out.println("Эта строка - палиндром.");
        } else {
            System.out.println("Эта строка - не палиндром.");
        }
    }

    private static String processString(String str) {
        return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    private static boolean checkPalindrome(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}