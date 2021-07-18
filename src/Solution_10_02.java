import java.util.*;

// 10.02. 变位词组
public class Solution_10_02 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            // 排序后方便直接对比
            Arrays.sort(chars);
            String tempS = new String(chars);
            if (!map.containsKey(tempS)) {
                List<String> tempList = new ArrayList<>();
                tempList.add(str);
                map.put(tempS, tempList);
            } else {
                map.get(tempS).add(str);
            }
        }
        for (String key: map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    }

    public static void main(String[] args) {
        String[] listString = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(listString);
    }
}
