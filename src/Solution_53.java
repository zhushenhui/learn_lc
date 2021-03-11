//53. 最大子序和
public class Solution_53 {
    public static int maxSubArray(int[] nums) {
        int pre = 0, max = nums[0];
        for (int temp : nums) {
            // 从第一个开始计算最大子数组，最后取综合最大的那个
            pre = Math.max(pre + temp, temp);
            max = Math.max(pre, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
