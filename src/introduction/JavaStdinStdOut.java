package introduction;

import java.util.Scanner;

public class JavaStdinStdOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();

        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
    }
}
