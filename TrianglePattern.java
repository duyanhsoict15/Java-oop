package Java;
import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        // Vòng lặp duyệt qua các dòng của tam giác
        for (int i = 1; i <= n; i++) {
            // In ra khoảng trắng để căn chỉnh
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In ra ký tự sao (*) tương ứng với chiều cao của tam giác
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Xuống dòng
            System.out.println();
        }

        scanner.close();
    }
}

