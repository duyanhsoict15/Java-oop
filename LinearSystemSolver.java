package Java;
import java.util.Scanner;

public class LinearSystemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients for the linear system of equations:");
        System.out.println("a11x1 + a12x2 = b1");
        System.out.println("a21x1 + a22x2 = b2");

        System.out.print("Enter coefficient 'a11': ");
        double a11 = scanner.nextDouble();

        System.out.print("Enter coefficient 'a12': ");
        double a12 = scanner.nextDouble();

        System.out.print("Enter coefficient 'b1': ");
        double b1 = scanner.nextDouble();

        System.out.print("Enter coefficient 'a21': ");
        double a21 = scanner.nextDouble();

        System.out.print("Enter coefficient 'a22': ");
        double a22 = scanner.nextDouble();

        System.out.print("Enter coefficient 'b2': ");
        double b2 = scanner.nextDouble();

        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            if ((a11 / a12 == a21 / a22) && (a11 / a12 == b1 / b2)) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x1 = (b1 * a22 - b2 * a12) / determinant;
            double x2 = (a11 * b2 - a21 * b1) / determinant;
            System.out.println("Solution:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
}
