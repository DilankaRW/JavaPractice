// Date in specific format

import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTimeFormat {
    public static void main(String[] args) {

//        String pattern = "dd-MM-yyyy HH:mm:ss z";
        String pattern = "yyyy MMMM dd EEEE HH:mm:ss zzzz";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String date = sdf.format(new Date());
        System.out.println(date);

        // 11-06-2024 12:20:34 IST
        // 2024 June 11 Tuesday 12:22:16 India Standard Time
    }
}
