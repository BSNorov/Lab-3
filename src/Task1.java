import java.util.Scanner;

public class Task1 {
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

        int K = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                K++;
            }
        }
        System.out.println("\nКоличество четных чисел: " + K);
    }
}
