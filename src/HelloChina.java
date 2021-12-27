import java.util.Arrays;
import java.util.Scanner;

public class HelloChina {
    public static void main(String[] args) {
        String[] arr = new String[]{"GG", "MM", "AA", "II", "PP"};

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
