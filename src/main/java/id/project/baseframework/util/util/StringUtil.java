package id.project.baseframework.util.util;

import org.apache.commons.lang.StringUtils;

import java.util.UUID;

/**
 * @author Ardi.Patengko
 */
public class StringUtil {

    public static String fixedLength(String data, int size) {
        return StringUtils.rightPad(data, size).substring(0, size);
    }

    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }
}
