import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int a = console.nextInt();
        System.out.print("Введите 2 число: ");
        int b = console.nextInt();
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        }
        System.out.print(a + b + " ");
        System.out.print(a - b + " ");
        System.out.print(a/b + " ");
        System.out.print(a*b + " ");
    }
}