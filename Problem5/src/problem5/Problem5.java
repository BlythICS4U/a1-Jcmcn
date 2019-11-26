package problem5;

import java.util.Scanner;
import java.util.*;

public class Problem5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a line of text");
        String input = keyboard.nextLine();
        StringTokenizer words = new StringTokenizer(input);
        StringBuilder line = new StringBuilder("");
        while (words.hasMoreTokens()) {
            String s1 = words.nextToken();
            String s5;
            s1 = s1.replaceAll("(?i)(\\w)(or)\\b", "$1our");
            s1 = s1.replace("\'", "\"");
            if (s1.compareTo("or") == 0) {
                s1 = "our";
            }
            /*
            To check if the first letter of the word is capital it must be separated of all ponctuation
            */
            s5 = s1.replace('?', ' ');
            s5 = s5.replace('!', ' ');
            s5 = s5.replace('\"', ' ');
            s5 = s5.replace(';', ' ');
            s5 = s5.replace(':', ' ');
            s5 = s5.replace('(', ' ');
            s5 = s5.replace(')', ' ');
            s5 = s5.replace('.', ' ');
            s5 = s5.replace(',', ' ');
            s5 = s5.replace('-', ' ');
            s5 = s5.trim();
            char s2 = s5.charAt(0);
            String s3 = String.valueOf(s2);
            String s4 = s3.toUpperCase();
            int value = s3.compareTo(s4);
            if (value == 0) {
                s1 = s1.toUpperCase();
                if (s1.compareTo("OR") == 0) {
                    s1 = "OUR";
                }
            }

            line.append(s1);
            line.append(" ");
        }

        System.out.println(line);

    }

}
