package com.cyberVision.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author heyhuo
 * @create 2021-02-19
 */
public class Utils {
    public Utils() {
    }

    public static String getDateNow(String pattern) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String format = sdf.format(d);
        System.out.println("格式化输出：" + format);
        return format;
    }
}
