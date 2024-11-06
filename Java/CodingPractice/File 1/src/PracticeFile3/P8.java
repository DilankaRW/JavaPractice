// Distinct characters and their count in a string.

package PracticeFile3;

import java.util.HashMap;
import java.util.Map;

public class P8 {
    public static void main(String[] args) {
        String S = "eeriulkfsyekjbwl";
        char[] chars = S.toCharArray();
        Map<Character, Integer> charsCount = new HashMap<>();

        for (char c : chars){
            if (charsCount.containsKey(c)){
                charsCount.put(c, charsCount.get(c) + 1);
            }else{
                charsCount.put(c,1);
            }
        }
        System.out.println(charsCount); // {r=1, b=1, s=1, e=3, u=1, f=1, w=1, i=1, y=1, j=1, k=2, l=2}
    }
}
