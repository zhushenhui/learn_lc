import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 451.根据字符出现频率排序
 * @author zsh
 * @date 2021/7/3
 */
public class Solution_451 {
    public static String frequencySort(String s) {
        StringBuilder tempString = new StringBuilder();
        // tempMap中key为字符，value为出现次数
        Map<Character, Integer> tempMap = new HashMap();
        for(int i=0;i < s.length();i++) {
            char tempChar = s.charAt(i);
            tempMap.put(tempChar, tempMap.containsKey(tempChar) ? tempMap.get(tempChar) + 1 : 1);
        }
        // 对tempMap根据value排序，方法百度来的
        HashMap<Character, Integer> finalOut = new LinkedHashMap<>();
        tempMap.entrySet()
                .stream()
                .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                .collect(Collectors.toList()).forEach(ele -> finalOut.put(ele.getKey(), ele.getValue()));
        finalOut.forEach((key, value) -> {
            for (int i = 0; i < value; i++) {
                tempString.append(key);
            }
        });
        return tempString.toString();
    }

    public static void main(String[] args) {
        String s = new String();
        s = "ssdfdsfffff";
        frequencySort(s);
    }
}
