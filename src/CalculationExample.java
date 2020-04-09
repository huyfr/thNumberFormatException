import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y) {
        int a, b, c, d;
        try {
            a = x + y;
            b = x - y;
            c = x * y;
            d = x / y;
            System.out.println("x+y= " + a);
            System.out.println("x-y= " + b);
            System.out.println("x*y= " + c);
            System.out.println("x/y= " + d);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        CalculationExample calculationExample = new CalculationExample();

        Scanner sc = new Scanner(System.in);
        int x, y;
        try {
            System.out.println("Nhap x:");
            x = sc.nextInt();
            System.out.println("Nhap y:");
            y = sc.nextInt();
            calculationExample.calculate(x, y);
        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
        }
    }
}
