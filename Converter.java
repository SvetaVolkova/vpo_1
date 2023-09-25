import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency = sc.nextDouble();
        System.out.println("Enter amount of money");
        int hryvna = sc.nextInt();
        int amount = ((int) (hryvna / currency));
        double change = hryvna - amount*currency;
        System.out.println("You can byu " + amount);
        if (change != 0) {
            System.out.printf("You rest of money is %.2f", change);
            System.out.println();
        }
        else {
            System.out.println("Здачі не має");
        }

    
    }
}
