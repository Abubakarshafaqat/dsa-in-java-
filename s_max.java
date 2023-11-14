import java.util.Scanner;

public class s_max {
    static int findMax(int[] arr) {
        int mx = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int s_repet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of arry :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in arry :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int mx = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int s_max = s_repet(arr);

        System.out.println("Second maximum value is :" + s_max);

    }
}