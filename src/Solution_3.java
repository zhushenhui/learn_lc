import java.util.HashMap;
import java.util.Map;

//3. 无重复字符的最长子串
public class Solution_3 {
    // 利用hashMap的key不可重复特点，字符做key，位置做value
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        Map<Character, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // 遍历hashMap，如果同key，则删去上个key和他前面的所有字符
            if (tempMap.containsKey(s.charAt(i))) {
                int tempValue = tempMap.get(s.charAt(i));
                tempMap.entrySet().removeIf(entry -> entry.getValue() <= tempValue);
            }
            tempMap.put(s.charAt(i), i);
            max = Math.max(max, tempMap.size());
            }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    // 重新写
    public static int lengthOfLongestSubstringTwo(String s) {
        Map<Character, Integer> tempMap = new HashMap<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (tempMap.containsKey(ch)) {
                left = Math.max(tempMap.get(ch) + 1, right);
            }
            tempMap.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
