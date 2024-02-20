import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите 1 строку: ");
        String a = console.nextLine();
        System.out.print("Введите 2 строку: ");
        String b = console.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else  {
            System.out.println("Строки не идентичны");

        }
    }
}