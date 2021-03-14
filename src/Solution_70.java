//70. 爬楼梯
// 此题目 f(n)=f(n-1)+f(n-2)
public class Solution_70 {
    public static int climbStairs(int n) {
        int p, q = 0, sum = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = sum;
            sum = p + q;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
