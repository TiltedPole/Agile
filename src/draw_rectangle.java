import java.sql.SQLOutput;
import java.util.Scanner;

public class draw_rectangle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter width: ");
            int width = sc.nextInt();
            System.out.println("Please enter length: ");
            int length = sc.nextInt();

            String top = "+";
            String side = "|";

            if(width > 0 && width <= 20 && length > 0 && length <= 20)
            {
                for (int i = 0; i < width; i++) {
                    top += "-";
                    side += " ";
                }
                top += "+";
                System.out.println(top);

                for (int i = 0; i < length; i++) {
                    System.out.println(side + "|");
                }
                System.out.println(top);
            }
        }
        catch (Exception e) {
            System.out.println("Entered value is invalid.");
        }
    }
}
