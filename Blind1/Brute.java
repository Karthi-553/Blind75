import java.util.Arrays;

class Brute {
    public static int[] twoSum(int[] nums, int target) {
        // BruteForce

        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 4 };
        int ans[] = twoSum(arr, 6);
        System.out.println(Arrays.toString(ans));
    }
}