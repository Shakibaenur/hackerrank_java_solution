package two_weeks_preparation_kit;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Quicksort usually has a running time of n x log(n), but is there an algorithm that can sort even faster? In general,
 * this is not possible. Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing the elements to one another. A comparison sort algorithm cannot beat n x log(n) (worst-case) running time, since n x log(n) represents the minimum number of comparisons needed to know where to place each element. For more details, you can see these notes (PDF).
 *
 * Alternative Sorting:-
 * Another sorting method, the counting sort, does not require comparison. Instead, you create an integer array whose index range covers the entire range of values in your array to sort. Each time a value occurs in the original array, you increment the counter at that index. At the end, run through your counting array, printing the value of each non-zero valued index that number of times.
 *
 * Example
 * arr = = [1, 1, 3, 2, 1]
 * All of the values are in the range [0...3], so create an array of zeros, result = [0, 0, 0, 0]. The results of each iteration follow:
 *
 * i        arr[i]                   result
 * Θ        1                     [0, 1, 0, 0]
 * 1         1                    [0, 2, 0, 0]
 * 2         3                    [0, 2, 0, 1]
 * 3         2                    [0, 2, 1, 1]
 * 4         1                    [0, 3, 1, 1]
 *
 * The frequency array is [0, 3, 1, 1]. These values can be used to create the sorted array as well: sorted = [1, 1, 1, 2, 3].
 */
class CountingSort1Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Integer[] frequesList=new Integer[100];
        Arrays.fill(frequesList,new Integer(0));
        for(int i=0;i< arr.size();i++){
            frequesList[arr.get(i)]++;
        }
        return Arrays.asList(frequesList);
    }

}

public class CountingSort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = CountingSort1Result.countingSort(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

