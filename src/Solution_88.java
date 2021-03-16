import java.util.Arrays;

//88. 合并两个有序数组
public class Solution_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);
        // 双指针
        int i = 0, j = 0, p = 0;
        while( i < m && j < n) {
            if (nums1Copy[i] < nums2[j]) {
                nums1[p++] = nums1Copy[i++];
            } else {
                nums1[p++] = nums2[j++];
            }
        }
        if (i < m)
            System.arraycopy(nums1Copy, i, nums1, i + j, m + n - i - j);
        if (j < n)
            System.arraycopy(nums2, j, nums1, i + j, m + n - i - j);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
}
