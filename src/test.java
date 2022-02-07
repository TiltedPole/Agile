import java.util.Scanner;

public class test
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        while(run){
            try{
                System.out.println("Enter num1: ");
                num1 = sc.nextInt();
                System.out.println("Enter num2: ");
                num2 = sc.nextInt();
                System.out.println("Enter num3: ");
                num3 = sc.nextInt();
                int product = num1 * num2 * num3;
                System.out.println(product);
                run = false;
            }
            catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            } // end catch
        } // end while
    }
}