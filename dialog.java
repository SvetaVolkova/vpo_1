import java.util.Scanner;

public class dialog{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hello");
        System.out.println("Як тебе звати");
        name = scanner.nextLine();
        System.out.println("Скільки тобі років");
        age = scanner.nextInt();

        System.out.println("Дуже приємно, " + name + "!");
        System.out.println("Я знаю тепер, що тобі " + age + " років");
    }
}