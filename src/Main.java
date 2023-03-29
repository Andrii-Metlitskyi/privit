import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = init(10);
        printUnpaired(arr);
    }


    public static int[] init(int capacity) {
        int[] arr = new int[capacity];
        Random rand = new Random();
        for (int i = 0; i < capacity; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }


    public static void printUnpaired(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
