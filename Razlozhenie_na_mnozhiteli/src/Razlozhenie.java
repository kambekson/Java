import java.util.Scanner;
public class Razlozhenie {
    public static void main(String[] args) {
        System.out.println("Введите число которое нужно разбить на множители.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        while (n != 1) {
            while (n % i == 0) {
                System.out.println(i);
                n = n/i;
            }
            i++;
        }

    }
}
