import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prefix(scanner));

    }
    public static boolean prefix(Scanner scanner){
        if (scanner.next().toLowerCase().startsWith("j")){
            return true;
        }
        return false;
    }
}