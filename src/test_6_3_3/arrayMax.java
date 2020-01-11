package test_6_3_3;

import java.util.Arrays;

public class arrayMax {
    public static void main(String[] args) {
        int[] a = {10, 11, 17, 15};
        int i = arrayMax(a);
        System.out.println(i);
    }
    public static int arrayMax(int[] a) {
        Arrays.sort(a);
        if (a.length == 0) {
            return 0;
        } else {
            return a[a.length - 1];
        }
    }
}
