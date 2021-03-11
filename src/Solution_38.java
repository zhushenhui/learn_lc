// 38. 外观数列
public class Solution_38 {
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        // pre为上一个
        String pre = countAndSay( n -1 );
        // 当前的数列
        String now = new String();
        // 第一个字符出现至少是1次
        int count = 1;
        for (int i = 0; i < pre.length(); i++) {
            // 这里加i == pre.length() - 1 是为了防止数组越界
            if (i == pre.length() - 1 || pre.charAt(i) != pre.charAt(i + 1)) {
                // 字符串直接拼接
                now = now + count + pre.charAt(i);
                // 重置0，因为下面会+1
                count = 0;
            }
            count++;
        }
        return now;
    }

    public static void main(String[] args) {
        String a = countAndSay(4);
        System.out.println(a);
    }
}
