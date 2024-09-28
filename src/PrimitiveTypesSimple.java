import java.util.Scanner;

public class PrimitiveTypesSimple {
    public static void main(String[] args) {
        // Примитивные типы данных и их информация
        System.out.println("Информация о примитивных типах данных:");
        System.out.println("int: 4 байта, диапазон: " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("double: 8 байт, диапазон: " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
        System.out.println("char: 2 байта, диапазон: от 0 до 65535");
        System.out.println("boolean: значения true или false");

        // Чтение данных от пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите число типа int: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Вы ввели число: " + intValue);

        System.out.print("Введите число типа double: ");
        double doubleValue = Double.parseDouble(scanner.nextLine());
        System.out.println("Вы ввели число с плавающей точкой: " + doubleValue);

        System.out.print("Введите символ типа char: ");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("Вы ввели символ: " + charValue);

        System.out.print("Введите значение типа boolean (true/false): ");
        boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Вы ввели логическое значение: " + booleanValue);

        scanner.close();
    }
}
