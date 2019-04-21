package com.tsien.mall.util;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/4/21 0021 16:13
 */

public class BigDecimalUtil {

    private BigDecimalUtil() {

    }

    public static BigDecimal add(Double v1, Double v2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(v2));
        return bigDecimal1.add(bigDecimal2);
    }

    public static BigDecimal sub(Double v1, Double v2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(v2));
        return bigDecimal1.subtract(bigDecimal2);
    }

    public static BigDecimal mul(Double v1, Double v2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(v2));
        return bigDecimal1.multiply(bigDecimal2);
    }

    public static BigDecimal div(Double v1, Double v2) {
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(v1));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(v2));
        //四舍五入，保留两位小数
        return bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP);
    }
}
