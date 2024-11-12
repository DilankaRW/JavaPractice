// Break and Continue

package PracticeFile3;

public class P30 {
    public static void main(String[] args) {

        /*
        // Break Statement
        for (int i=1; i<=10; i++){
            if (i==5)
                break;
            System.out.println(i);
        }
        // Output - 1,2,3,4
         */

        // Continue Statement
        for (int i=1; i<=10; i++){
            if (i==5)
                continue;
            System.out.println(i);
        }
        // Output - 1,2,3,4,6,7,8,9,10
        // Number 5 does not print
    }
}
