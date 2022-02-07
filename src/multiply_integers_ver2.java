import java.util.Scanner;

public class multiply_integers_ver2
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        try{
            while(run){
                System.out.println("Enter num1: ");
                int num1 = sc.nextInt();
                System.out.println("Enter num2: ");
                int num2 = sc.nextInt();
                System.out.println("Enter num3: ");
                int num3 = sc.nextInt();

                int product = num1 * num2 * num3;
                System.out.println(product);
                run = false;
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input. Try again.");
        }
    }
}
