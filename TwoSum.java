import java.util.*;

public class TwoSum {
    /**
     * Main Method, Instatiates the two Examples
     * @param args
     */
    public static void main(String[] args) {
        int sum = 9;
        int[] num = { 2, 12, 8, 7 };
        int sum2 = 40;
        int[] num2 = { 1, 13, 18, 20, 30 };
        TwoSum a = new TwoSum();
        a.solveTwoSum(num, sum);
        System.out.println("-------------------------------------");
        a.solveTwoSum(num2, sum2);

    }
/**
 * Uses Two Pointers algorithm to solve for sum
 * @param num
 * @param sum
 * @return
 */
    public int[] solveTwoSum(int[] num, int sum) {
        int i = 0;
        int j = num.length - 1;

        while (i < j) {
            if (num[i] + num[j] == sum) {
                System.out.println("You found a sum!");
                int[] indices = { num[i], num[j] };
                System.out.println(Arrays.toString(indices));
                return num;
            } else if (num[i] + num[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        // int[] wrong = {-1};

        System.out.println("You did not find a sum..");
        int[] wrong = { -1 };
        System.out.println(Arrays.toString(wrong));
        return wrong;

    }

}