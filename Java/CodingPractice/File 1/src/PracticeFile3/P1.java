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

        String pattern1  = "1dd-MM-yyyy HH:mm:ss z";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
        String date1 = sdf1.format(new Date());
        System.out.println(date1);
    }
}
