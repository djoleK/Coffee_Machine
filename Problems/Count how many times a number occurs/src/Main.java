import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int element = scanner.nextInt();

        System.out.println(counter(array, element));

    }

    public static int counter(int[] array, int element) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                counter++;
            }
        }
        return counter;
    }
}