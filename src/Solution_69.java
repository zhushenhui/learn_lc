// 69. x 的平方根
// 二分法
public class Solution_69 {
    public static int mySqrt(int x) {
        long left = 0;
        long right = x / 2 + 1;
        while (left < right) {
            long mid = (left + right) / 2 + 1;
            long squ = mid * mid;
            if (squ > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int)left;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }
}
