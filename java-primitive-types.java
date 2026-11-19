import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Інформація про примітивні типи даних:");

        System.out.println("\nНазва: byte");
        System.out.println("Розмір: " + Byte.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);

        System.out.println("\nНазва: short");
        System.out.println("Розмір: " + Short.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);

        System.out.println("\nНазва: int");
        System.out.println("Розмір: " + Integer.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);

        System.out.println("\nНазва: long");
        System.out.println("Розмір: " + Long.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);

        System.out.println("\nНазва: float");
        System.out.println("Розмір: " + Float.SIZE + " біт");
        System.out.println("Мінімальне значення: " + (-Float.MAX_VALUE));
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);

        System.out.println("\nНазва: double");
        System.out.println("Розмір: " + Double.SIZE + " біт");
        System.out.println("Мінімальне значення: " + (-Double.MAX_VALUE));
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);

        System.out.println("\nНазва: char");
        System.out.println("Розмір: " + Character.SIZE + " біт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);

        System.out.println("\nНазва: boolean");
        System.out.println("Розмір: не визначено");
        System.out.println("Мінімальне значення: false");
        System.out.println("Максимальне значення: true");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nВведіть значення byte: ");
            byte byteValue = Byte.parseByte(scanner.nextLine());

            System.out.print("Введіть значення short: ");
            short shortValue = Short.parseShort(scanner.nextLine());

            System.out.print("Введіть значення int: ");
            int intValue = Integer.parseInt(scanner.nextLine());

            System.out.print("Введіть значення long: ");
            long longValue = Long.parseLong(scanner.nextLine());

            System.out.print("Введіть значення float: ");
            float floatValue = Float.parseFloat(scanner.nextLine());

            System.out.print("Введіть значення double: ");
            double doubleValue = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть значення char: ");
            char charValue = scanner.nextLine().charAt(0);

            System.out.print("Введіть значення boolean (true або false): ");
            boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());

            System.out.println("\nВведені значення:");
            System.out.println("byte: " + byteValue);
            System.out.println("short: " + shortValue);
            System.out.println("int: " + intValue);
            System.out.println("long: " + longValue);
            System.out.println("float: " + floatValue);
            System.out.println("double: " + doubleValue);
            System.out.println("char: " + charValue);
            System.out.println("boolean: " + booleanValue);
        }
    }
}