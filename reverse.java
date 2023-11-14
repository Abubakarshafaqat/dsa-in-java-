import java.util.Scanner;

public class reverse {

    static int[] reverse(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of arry");
        int n = s1.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element in arry");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s1.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(reverse(arr));
        }
    }
}
