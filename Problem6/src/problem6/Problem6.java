package problem6;

import java.util.Scanner;
import java.util.*;

public class Problem6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type a line of text: ");
        String input = keyboard.nextLine();
        StringTokenizer words = new StringTokenizer(input);
        StringBuilder line = new StringBuilder("");
        StringBuilder testline = new StringBuilder("");
        while (words.hasMoreTokens()) {
            String s1 = words.nextToken();
            if (s1.length() > 16) {
                System.out.println("The input includes " + s1 + ", which is longer than 16 characters.");
                return;
            }
            testline.append(" ");
            testline.append(s1);
            String tls = testline.toString();
            tls = tls.trim();
            if (tls.length() < 16) {
                line.append(s1);
                line.append(" ");
            }
            if (tls.length() == 16) {
                testline.setLength(0);
                line.append(s1);
                line.append("\n");
            }

            if (tls.length() > 16) {
                testline.setLength(0);
                testline.append(s1);
                line.append("\n");
                line.append(s1);
                line.append(" ");
            }

        }
        System.out.print(line);

    }

}
