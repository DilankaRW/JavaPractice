// Create a pyramid of characters.
// Distinct characters and their count in a string.

package PracticeFile3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S.nextInt();
        S.close();
        for (int i=1; i<=row; i++){
            for (int x=row-i; x>0; x--){
                System.out.print(" ");
            }
            for (int x=1; x<=(2*i-1); x++){
                System.out.print("*");
            }
            System.out.println();
        }

        ////////////////////

        String str1 = "sdfjhSmnDdssDfsDdasaAsaASd";
        char[] chars = str1.toCharArray();
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c : chars){
            if (charsCount.containsKey(c)){
                charsCount.put(c, charsCount.get(c) + 1);
            }else{
                charsCount.put(c, 1);
            }
        }
        System.out.println(charsCount);
    }
}
