import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12};

        int streak = 1, highestStreak = 1;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] > input[i]) streak++;
            else streak = 1;

            if (streak > highestStreak) {
                highestStreak = streak;
            }
        }

        System.out.println("najwiekszy streak wynosi " + highestStreak);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc elementow tablicy: ");

        int limit = sc.nextInt();
        int[] arr = new int[limit];
        int i = 0;
        System.out.println("Podaj " + limit + " liczb: ");
        while (i<limit) {
            arr[i++] = sc.nextInt();
        };

        System.out.println(findLongestChain(arr));
    }

    private static int findLongestChain(int[] array) {
        int max = 1, idx=1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                ++idx;
            } else {
                if (idx>max) max = idx;
                idx=1;
            }
        }

        return Math.max(idx, max);
    }
}