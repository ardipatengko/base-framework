package id.project.baseframework.util.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ardi.Patengko
 */
public class DateUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

    public static String dateToString(Date date, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            return sdf.format(date);
        } catch (Exception ex) {
            LOGGER.error("Error convert date to string", ex);
        }
        return null;
    }

    public static Date stringToDate(String date, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            sdf.setLenient(false);
            return sdf.parse(date);
        } catch (ParseException ex) {
            LOGGER.error("Error convert string to date", ex);
        }
        return null;
    }

    public static String changeDateFormat(String date, String oldFormat, String newFormat) {
        try {
            SimpleDateFormat oldSdf = new SimpleDateFormat(oldFormat);
            oldSdf.setLenient(false);

            Date result = oldSdf.parse(date);

            SimpleDateFormat newSdf = new SimpleDateFormat(newFormat);
            newSdf.setLenient(false);

            return newSdf.format(result);
        } catch (Exception ex) {
            LOGGER.error("Change date format error", ex);
        }
        return null;
    }
}
