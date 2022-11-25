package two_weeks_preparation_kit;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 *
 * Example
 *
 * The unique element is .
 *
 * Function Description
 *
 * Complete the lonelyinteger function in the editor below.
 *
 * lonelyinteger has the following parameter(s):
 *
 * int a[n]: an array of integers
 * Returns
 *
 * int: the element that occurs only once
 * Input Format
 *
 * The first line contains a single integer, , the number of integers in the array.
 * The second line contains  space-separated integers that describe the values in .
 *
 * Constraints
 *
 * It is guaranteed that  is an odd number and that there is one unique element.
 * , where .
 */
class LonelyIntegerResult {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int tmp = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            tmp ^= a.get(i);
        }
        return tmp;
    }

}



public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = LonelyIntegerResult.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
