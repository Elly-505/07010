import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения");
        System.out.println("Введите значение а");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("a = " + a);
        System.out.println("Введите значение b");
        double b = scanner.nextDouble();
        System.out.println("b = " + b);
        System.out.println("Введите значение c");
        double c = scanner.nextDouble();
        System.out.println("c = " + c);
        double D = Math.pow(b, 2) - 4 * a * c;
        double x1 = ((-b - Math.sqrt(D)) / (2 * a));
        double x2 = ((-b + Math.sqrt(D)) / (2 * a));
        if (D == 0) {
            System.out.println("Решение:");
            System.out.println("x = " + x1);
        } else if (D < 0) {
            System.out.println("Решение: корней нет");
        } else {
            System.out.println("Решение:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}


