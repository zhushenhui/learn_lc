//67. 二进制求和
public class Solution_67 {
    public static String addBinary(String a, String b) {
        StringBuffer rt = new StringBuffer();
        int len = a.length() > b.length() ? a.length() : b.length();
        // 进位标志
        int flag = 0;
        // 为了在a,b长度不一致时避免数组越界，计算是否需要取值
        int add_a = 0;
        int add_b = 0;
        for (int i = 1; i <= len; i++) {
            add_a = a.length() - i > -1 ? (a.charAt(a.length() - i) - '0') : 0;
            add_b = b.length() - i > -1 ? (b.charAt(b.length() - i) - '0') : 0;
            int rt_temp = add_a + add_b + flag;
            // 插入首位
            rt.insert(0,(char)((rt_temp % 2) + '0'));
            flag = rt_temp > 1 ? 1 : 0;
        }
        if (flag == 1) rt.insert(0,'1');
        return rt.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11111","1111"));
    }
}
