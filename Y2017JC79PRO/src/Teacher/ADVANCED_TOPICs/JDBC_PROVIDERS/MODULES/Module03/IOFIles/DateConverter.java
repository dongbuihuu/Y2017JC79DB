package BaseUltils.IOFIles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    /**
     * Nghiệp vụ convert kiểu dữ liệu từ Date --> Sang String 
     * format: "yyyy-MM-dd"
     */
    public static String convertDateToString(Date date, String format) {
        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat(format);
        return mySimpleDateFormat.format(date);
    }

    /**
     * Nghiệp vụ chuyển đổi từ String --> Date trong Java
     */
    public static Date convertStringToDate(String dateStr, String format) {
        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat(format);
        try {
            return mySimpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }
}
