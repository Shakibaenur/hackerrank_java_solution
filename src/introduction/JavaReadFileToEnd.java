package introduction;

import java.util.Scanner;

public class JavaReadFileToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int i = 1;
        while (scanner.hasNext())
        {
            str = scanner.nextLine();
            System.out.print(Integer.toString(i) + ' ' + str + '\n');
            i++;
        }
    }
}
