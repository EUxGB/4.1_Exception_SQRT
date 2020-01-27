import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        Main x = new Main();
        while (true) {
            Scanner num = new Scanner(System.in);
            System.out.print("Введите число:");
            double my_num = num.nextDouble();
            System.out.println("Корень из " + my_num + " = " + x.sqrt(my_num) + "\n");
        }
    }

    public static double sqrt(double x) throws IllegalArgumentException {
        if (x < 0) throw new IllegalArgumentException("Expected non-negative number, got " + x);
        return Math.sqrt(x);
    }
}
