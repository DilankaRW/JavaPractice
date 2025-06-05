// Date in specific format

package PracticeFile4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P20 {
    public static void main(String[] args) {
        String pattern = "yyyy MMMM dd EEEE HH:mm:ss zzzz";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String date = sdf.format(new Date());
        System.out.println(date);
    }
}
