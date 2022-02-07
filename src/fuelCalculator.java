import java.util.Scanner;

public class fuelCalculator {


    public static void main(String[] args) {
        float price;
        float efficiency;
        float tank;
        double fuelConsumed;
        double sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price: ");
        price = sc.nextFloat();
        System.out.println("Enter efficiency: ");
        efficiency = sc.nextFloat();

        fuelConsumed = (100 / 10.59);
        sum = fuelConsumed * price;
        System.out.println(sum);
    }
}
