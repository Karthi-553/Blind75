import java.util.*;

class Better {
    public static int[] twoSum(int[] nums, int target) {
        // Better Approach space->O(n)
        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(target - nums[i]) != null) {
                ans[0] = i;
                ans[1] = hm.get(target - nums[i]);
                break;
            } else {
                hm.put(nums[i], i);
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