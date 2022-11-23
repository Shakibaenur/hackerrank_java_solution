package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int output=a;
            for(int j=0;j<n;j++){
                output += (int)(Math.pow(2, j) * b);
                System.out.print(output+" ");
            }

            System.out.println();
        }
        in.close();
    }
}
