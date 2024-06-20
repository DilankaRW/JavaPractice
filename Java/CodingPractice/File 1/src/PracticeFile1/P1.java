// Remove Character
package PracticeFile1;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        String S = "aknaL irS";
        String RS = new StringBuilder(S).reverse().toString();
        System.out.println(RS); // Sri Lanka

        String O = "Ciiiiiiiiioiliioiiimiboiiiiii";
        O = O.replaceAll("i","");
        System.out.println(O); // Colombo

        String RLTS = "       Hello       ";
        String TS = RLTS.trim();
        System.out.println(TS); // Hello

        String RLS = "    Hello";
        RLS = RLS.replaceAll("^\\s+","");
        System.out.println(RLS); // Hello

        String RTS = "Hello          ";
        RTS = RTS.replaceAll("\\s+$","");
        System.out.println(RTS); // Hello

        String[] names = {"sdgff","dstys","fdds"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // [dstys, fdds, sdgff]
    }
}
