// 28. 实现 strStr()
class Solution {
    public static int strStr(String haystack, String needle) {
        // 如果子串长度为0返回0
        if (needle.length() == 0)
            return 0;
        // 暴力法，母串从最左侧开始匹配，匹配时母串剩余长度不能比字串短
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // 首字符匹配则继续
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean flag = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                    }
                }
                // 刚好匹配完结束
                if (flag == true)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = strStr("hello", "ll");
        System.out.println(a);
    }
}