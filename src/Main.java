import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void noweZadanie() {

    }

    public static void jakasMetoda() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = new int[10];
        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int sprawdzamy = input[i];

            for (int j = i+1; j < 10; j++) {
                if (sprawdzamy == input[j]) System.out.println("duplikat: " + sprawdzamy);
            }
        }
    }

    public static double[] writeNumbersThatRepeat(double... a) {
        double[] outputNumbers = new double[0];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && checkOutputTable(a[i], outputNumbers)) {
                    outputNumbers = Arrays.copyOf(outputNumbers, outputNumbers.length + 1);
                    outputNumbers[count] = a[i];
                    count++;
                }
            }
        }

        return outputNumbers;
    }

    private static boolean checkOutputTable(double value, double[] outputNumbers) {
        for (int i = 0; i < outputNumbers.length; i++) {
            if (outputNumbers[i] == value) {
                return false;
            }
        }
        return true;
    }

    private static int[] usunDuplikaty(int[] tablica) {
        Arrays.sort(tablica);
        int dlugosc = tablica.length;
        int rozmiarBezDuplikatow = 1;

        for (int i = 1; i < dlugosc; i++) {
            if (tablica[i] != tablica[i - 1]) {
                rozmiarBezDuplikatow++;
            }
        }

        int[] tablicaBezDuplikatow = new int[rozmiarBezDuplikatow];
        tablicaBezDuplikatow[0] = tablica[0];

        int indeks = 1;

        for (int i = 1; i < dlugosc; i++) {
            if (tablica[i] != tablica[i - 1]) {
                tablicaBezDuplikatow[indeks] = tablica[i];
                indeks++;
            }
        }

        return tablicaBezDuplikatow;
    }
}