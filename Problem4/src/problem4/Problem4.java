package problem4;

import java.util.Scanner;
import java.util.*;

public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        String s1 = input.nextLine();
        /*
        Separation of ponctuation from the words
        */
        s1 = s1.replace('?', ' ');
        s1 = s1.replace('!', ' ');
        s1 = s1.replace('\'', ' ');
        s1 = s1.replace('\"', ' ');
        s1 = s1.replace(';', ' ');
        s1 = s1.replace(':', ' ');
        s1 = s1.replace('(', ' ');
        s1 = s1.replace(')', ' ');
        s1 = s1.replace('.', ' ');
        s1 = s1.replace(',', ' ');
        s1 = s1.replace('-', ' ');
        s1 = s1.toLowerCase();
        StringTokenizer words = new StringTokenizer(s1);
        String s3;
        /*
        Creating a string with all the words and all the characters
        */
        StringBuilder sl = new StringBuilder();
        while (words.hasMoreTokens()) {
            s3 = words.nextToken();
            s3 = s3.trim();
            sl.append(s3);
        }
        /*
        Creating a string of all chracters in the input but in reverse
        */
        StringBuilder sb = new StringBuilder();
        for (int i = sl.length() - 1; i >= 0; i--) {
            sb.append(sl.charAt(i));
        }
        String s2 = sb.toString();
        int a = sl.toString().compareTo(s2);
        if (a == 0) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is NOT a palindrome");
        }

    }

}
