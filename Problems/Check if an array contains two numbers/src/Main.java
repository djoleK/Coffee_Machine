import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = 0, m = 0;
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
        System.out.println(contains(array, n, m));
    }

    public static boolean contains(int[] array, int n, int m) {
        for (int i = 1; i < array.length; i++){
            if (array[i] == n && array[i - 1] == m){
                return true;
            }else if (array[i] == m && array[i - 1] == n) {
                return true;
            }
        }
        return false;
    }
}