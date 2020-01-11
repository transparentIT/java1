package test_6_1_1;

public class sumArrayItems {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 12};
        int i = sumArrayItems(a);
    }
    public static int sumArrayItems(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            k = k + a[i];
        }
        return k;
    }
}
