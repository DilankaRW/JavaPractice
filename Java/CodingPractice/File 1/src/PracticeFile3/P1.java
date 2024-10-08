// Date in specific format

package PracticeFile3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P1 {
    public static void main(String[] args) {
        String pattern  = "dd-mm-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String date = sdf.format(new Date());
        System.out.println(date);
    }
}
