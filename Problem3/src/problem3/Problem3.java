package problem3;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (1==1){
            System.out.print("Type the Kilometers: ");
            double km = input.nextDouble();
            if (km < 0){
                break;
            }
            System.out.print("Type the Litres: ");
            double l = input.nextDouble();
            if (l < 0){
                break;
            }
            double fuel = 100*l/km;
            System.out.printf("Fuel Efficiency = %.2f ", fuel);
            System.out.println("\n");
        }
        
    }
    
}
