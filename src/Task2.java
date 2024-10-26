import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива N: ");
        int size = sc.nextInt();

        while (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом.");
            size = sc.nextInt();
        }

        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                System.out.println("Первый недопустимый элемент на позиции: " + (i + 1));
                return;
            }
        }
        System.out.println(0);
    }
}

// В задании есть неопределенности: 1) Выводить номер элемента из исходного массива или отсортированного?
// 2) Номер первого элемента должен начинаться с нуля или с единицы? Номер порядковый или индекс?
