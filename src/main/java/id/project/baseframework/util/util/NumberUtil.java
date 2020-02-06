package id.project.baseframework.util.util;

import java.math.BigDecimal;

/**
 * @author Ardi.Patengko
 */
public class NumberUtil {

    public static String formatAmount(String amount, Integer scale){
        BigDecimal value = new BigDecimal(amount);
        value = value.setScale(scale);
        return value.toString();
    }

    public static String formatAmount(BigDecimal amount, Integer scale){
        return amount.setScale(scale).toString();
    }
}
