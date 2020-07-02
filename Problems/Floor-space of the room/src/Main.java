import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "triangle":
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    System.out.println(triangleArea(a, b, c));
                    break;
                case "rectangle":
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();
                    System.out.println(rectangleArea(x, y));
                    break;
                case "circle":
                    double r = scanner.nextDouble();
                    System.out.println(circleArea(r));
                    break;
            }
        }


    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }

    public static double circleArea(double r) {
        return r * r * 3.14;
    }
}
