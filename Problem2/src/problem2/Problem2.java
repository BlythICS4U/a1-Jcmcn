package problem2;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first grade");
        double n1 = number.nextDouble();
        String d1 = grades(n1);
        System.out.println(d1);
        System.out.println("Enter the second grade");
        double n2 = number.nextDouble();
        String d2 = grades(n2);
        System.out.println(d2);
        System.out.println("Enter the third grade");
        double n3 = number.nextDouble();
        String d3 = grades(n3);
        System.out.println(d3);
        System.out.println("Enter the fourth grade");
        double n4 = number.nextDouble();
        String d4 = grades(n4);
        System.out.println(d4);
        System.out.println("Enter the fifth grade");
        double n5 = number.nextDouble();
        String d5 = grades(n5);
        System.out.println(d5);
    }
        public static String grades(double i){
            if (50.0 <= i && i<= 53.0){
                return ("D-");
            }
            else if (54.0 <= i && i<= 57.0){
                return ("D");
            }
            else if (58.0 <= i && i<= 61.0){
                return ("D+");
            }
            else if (62.0 <= i && i<= 65.0){
                return ("C-");
            }
            else if (66.0 <= i && i<= 69.0){
                return ("C");
            }
            else if (70.0 <= i && i<= 73.0){
                return ("C+");
            }
            else if (74.0 <= i && i<= 77.0){
                return ("B-");
            }
            else if (78.0 <= i && i<= 81.0){
                return ("B");
            }
            else if (82.0 <= i && i<= 85.0){
                return ("B+");
            }
            else if (86.0 <= i && i<= 89.0){
                return ("A-");
            }
            else if (90.0 <= i && i<= 94.0){
                return ("A");
            }
            else if (95.0 <= i && i<= 100.0){
                return ("A+");
            }
            else{
            return "Not acceptable grade";
            }
        }
    }
