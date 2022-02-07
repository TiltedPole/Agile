import java.util.Scanner;

public class multiply_integers
{

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3= 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        num3 = sc.nextInt();

        int product = num1 * num2 * num3;
        System.out.println(product);
    }
}
