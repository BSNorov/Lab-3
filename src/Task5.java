import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMainMenu();
            int choice = getValidChoice(sc);

            switch (choice) {
                case 1:
                    double[] dimensions = getRectangleDimensions(sc);
                    double area = calculateRectangleArea(dimensions);
                    System.out.println("Площадь прямоугольника: " + area);
                    break;
                case 2:
                    printProgramInfo();
                    break;
                case 3:
                    printDeveloperInfo();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите один из пунктов меню.");
            }
        }
        sc.close();
    }

    public static void printMainMenu() {
        System.out.println("\nГлавное меню:");
        System.out.println("1. Выполнить расчет");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт меню: ");
    }

    public static int getValidChoice(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Неверный ввод. Введите число: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double[] getRectangleDimensions(Scanner sc) {
        double[] dimensions = new double[2];
        dimensions[0] = getPositiveInput(sc, "Введите длину прямоугольника (положительное число): ");
        dimensions[1] = getPositiveInput(sc, "Введите ширину прямоугольника (положительное число): ");
        return dimensions;
    }

    public static double getPositiveInput(Scanner sc, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            while (!sc.hasNextDouble()) {
                System.out.print("Ошибка: Введите корректное число: ");
                sc.next();
            }
            value = sc.nextDouble();
            if (value > 0) {
                break;
            } else {
                System.out.println("Ошибка: число должно быть положительным.");
            }
        }
        return value;
    }

    public static double calculateRectangleArea(double[] dimensions) {
        return dimensions[0] * dimensions[1];
    }

    public static void printProgramInfo() {
        System.out.println("Эта программа предназначена для расчета площади прямоугольника.");
    }

    public static void printDeveloperInfo() {
        System.out.println("Разработчик: Бехруз, студент магистратуры по направлению 'Разработка и управление в программных проектах!'");
    }
}
