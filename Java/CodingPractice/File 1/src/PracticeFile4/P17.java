// Distinct characters and their count in a string.

package PracticeFile4;

import java.util.HashMap;
import java.util.Map;

public class P17 {
    public static void main(String[] args) {
        String str1 = "abcdABCDasdsasdc";
        char[] chars = str1.toCharArray();
        Map<Character, Integer> charsCount = new HashMap<>();

        for (char c : chars){
            if (charsCount.containsKey(c)){
                charsCount.put(c, charsCount.get(c) + 1);
            }else {
                charsCount.put(c , 1);
            }
        }
        System.out.println(charsCount); // {a=3, A=1, b=1, B=1, c=2, C=1, s=3, d=3, D=1}
    }
}
