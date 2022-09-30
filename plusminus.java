import java.util.*;

public class Test {
    static void makeComp(int[] arr, int len) {
        int l = len / 2;
        for (int i = 0; i < l; i++) {
            arr[i + len] = arr[i + l];
        }
        len += len / 2;
        for (int i = 0; i < l; i++) {
            arr[i + len] = arr[i];
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] str = new int[n];
        n = (int) (Math.log(n) / Math.log(2));
        Arrays.fill(str, -1);
        if (n == 0)
            str[0] = 0;
        else if (n == 1){
            str[0] = 0;
            str[1] = 1;          
        }
        else {
            str[0] = 0;
            str[1] = 1;
            int len = 2;
            for (int i = 2; i <= n; i++) {
                makeComp(str, len);
                len *= 2;
            }
        }
        char[][] ans = new char[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i] == str[j])
                    ans[i][j] = '+';
                else
                    ans[i][j] = '-';
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                System.out.print(ans[i][j]);
                if (j != str.length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}