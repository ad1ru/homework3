import java.util.Arrays;

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
    }
}