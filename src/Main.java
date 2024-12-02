import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please inform the registered temperatures (separate them with only a space): ");
        String tempInput = s.nextLine();
        String[] tempStrings = tempInput.split(" ");

        int[] temperatures = new int[tempStrings.length];
        for (int i = 0; i < tempStrings.length; i++) {
            temperatures[i] = Integer.parseInt(tempStrings[i]);
        }

        System.out.print("Inform the maximum temperature expected: ");
        int max = s.nextInt();

        System.out.print("Inform the minimum temperature expected: ");
        int min = s.nextInt();

        String[] result = dailyTemperatures(temperatures, max, min);
        System.out.print("\n");
        for (String temp : result) {
            System.out.print(temp + "\n");
        }
    }

    public static String[] dailyTemperatures (int[] temperatures, int max, int min) {
        int n = temperatures.length;
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            if (temperatures[i] > max) {
                res[i] = "Alert! Temperature above the maximum expected.";
            } else if (temperatures[i] < min) {
                res[i] = "Alert! Temperature below the minimmum expected.";
            } else {
                res[i] = "Normal temperature.";
            }
        }
        return res;
    }
}