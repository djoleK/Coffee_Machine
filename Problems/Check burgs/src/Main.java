import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String input;
        while (scanner.hasNext()){
            input = scanner.nextLine();
            System.out.println(endsWith(input));

        }
    }
    public static boolean endsWith(String input) {
        if (input.endsWith("burg")){
            return true;
        }
        return false;
    }
}