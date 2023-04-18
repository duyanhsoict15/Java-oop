package Java;
import java.util.Arrays;

public class ArraySortingAndSum {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 7, 3, 1, 8, 6, 9, 2, 4 }; // Mảng số nguyên đầu vào

        System.out.println("Mảng số nguyên trước khi sắp xếp: " + Arrays.toString(arr));

        // Sắp xếp mảng
        Arrays.sort(arr);

        System.out.println("Mảng số nguyên sau khi sắp xếp: " + Arrays.toString(arr));

        // Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Tính giá trị trung bình cộng của các phần tử trong mảng
        double average = (double) sum / arr.length;

        System.out.println("Tổng các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng: " + average);
    }
}

