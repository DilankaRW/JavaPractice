// Date in specific format

package PracticeFile3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P11 {
    public static void main(String[] args) {
        String S = "yyyy mm dd";
        SimpleDateFormat sdf = new SimpleDateFormat(S);
        String date = sdf.format(new Date());
        System.out.println(date);
    }
}
