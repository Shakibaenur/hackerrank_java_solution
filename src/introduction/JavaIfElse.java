package introduction;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result="Weird";
        if(N%2==0){
            if(N>=2 && N<=5){
                result="Not Weird";
            }
            else if(N>20){
                result="Not Weird";
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
