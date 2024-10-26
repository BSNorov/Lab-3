public class Task3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};

        swapArrays(A, B);

        System.out.println("Массив А после преобразования:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\nМассив B после преобразования:");
        for (int num : B) {
            System.out.print(num + " ");
        }
    }

    public static void swapArrays(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            A[i] = B[i];
            B[i] = temp;
        }
    }
}