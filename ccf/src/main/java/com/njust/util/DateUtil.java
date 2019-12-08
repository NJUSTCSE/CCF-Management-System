package com.njust.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class DateUtil {
	
	public static final String CHINA_DATE_FORMAT = "yyyy年MM月dd日";
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm:ss";
    
    public static Date strToDate(String strDate) {
    	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    	  ParsePosition pos = new ParsePosition(0);
    	  Date strtodate = formatter.parse(strDate, pos);
    	  return strtodate;
    	 }

public static Date getCurrDate() {return parseDate(formatDate(new Date())); }
public static Date getCurrDateTime() {return parseDate(formatDate(new Date())); }
public static int compareDate(String dateStr1, String dateStr2) {
    Date date1 = parseDate(dateStr1);
    Date date2 = parseDate(dateStr2);
    if (date1.getTime() > date2.getTime())
        return -1;
    else if (date1.getTime() < date2.getTime())
        return 1;
    else
        return 0;
}

public static int compareDate(Date date1, Date date2) {
    if (date1.getTime() > date2.getTime())
        return -1;
    else if (date1.getTime() < date2.getTime())
        return 1;
    else
        return 0;
}
public static int getDiffDays(Date startDate, Date endDate) {
	//这个不能用
    int days = 0;
    if (startDate.after(endDate)) {
        Date temp = startDate;
        startDate = endDate;
        endDate = temp;
    }
    days = (int) (endDate.getTime() - startDate.getTime()) / 1000 * 60 * 60 * 24;
    return days;
}
public static int  longOfTwoDate(Date first,Date second) throws ParseException{
                 Calendar calendar = Calendar.getInstance();
                 calendar.setTime(first);
                 int cnt = 0;
              while(calendar.getTime().compareTo(second)!=0){
                   calendar.add(Calendar.DATE, 1);
                   cnt++;
                }
                return cnt;
    }

 //由java.util.Date到java.sql.Date的类型转换
public static Date getSqlDate(java.util.Date date) {
    return new Date(date.getTime());
}

public static String formatDate(Date date, String format) {
    return new SimpleDateFormat(format).format(date);
}

public static String formatDate(Date date) {
    return formatDate(date, DATE_FORMAT);
}

public static String formateChinaDate(Date date) {
    return formatDate(date, CHINA_DATE_FORMAT);
}

public static String formateDateTime(Date date) {
    return formatDate(date, DATETIME_FORMAT);
}

public static String formateTime(Date date) {
    return formatDate(date, TIME_FORMAT);
}


//-----------------格式化字符串为日期--------------------------------------

public static Date parseDate(String date, String format) {
    try {
        return new SimpleDateFormat(format).parse(date);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return null;
}

public static Date parseDate(String date) { 
	return parseDate(date, DATE_FORMAT);
	}
public static Date parseChinaDate(String date) {
    return parseDate(date, CHINA_DATE_FORMAT);
}
public static Date parseDateTime(String date) {
    return parseDate(date, DATETIME_FORMAT);
}
public static Date parseTime(String date) {
    return parseDate(date, TIME_FORMAT);
}
/**
 * 将String字符串转换为java.util.Date格式日期
 * 
 * @param strDate
 *            表示日期的字符串
 * @param dateFormat
 *            传入字符串的日期表示格式（如："yyyy-MM-dd HH:mm:ss"）
 * @return java.util.Date类型日期对象（如果转换失败则返回null）
 */
public static java.util.Date strToUtilDate(String strDate, String dateFormat) {
    SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
    java.util.Date date = null;
    try {
        date = sf.parse(strDate);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return date;
}

/**
 * 将String字符串转换为java.sql.Timestamp格式日期,用于数据库保存
 * 
 * @param strDate
 *            表示日期的字符串
 * @param dateFormat
 *            传入字符串的日期表示格式（如："yyyy-MM-dd HH:mm:ss"）
 * @return java.sql.Timestamp类型日期对象（如果转换失败则返回null）
 */
public static java.sql.Timestamp strToSqlDate(String strDate, String dateFormat) {
    SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
    java.util.Date date = null;
    try {
        date = sf.parse(strDate);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    java.sql.Timestamp dateSQL = new java.sql.Timestamp(date.getTime());
    return dateSQL;
}

/**
 * 将java.util.Date对象转化为String字符串
 * 
 * @param date
 *            要格式的java.util.Date对象
 * @param strFormat
 *            输出的String字符串格式的限定（如："yyyy-MM-dd HH:mm:ss"）
 * @return 表示日期的字符串
 */
public static String dateToStr(java.util.Date date, String strFormat) {
    SimpleDateFormat sf = new SimpleDateFormat(strFormat);
    String str = sf.format(date);
    return str;
}

/**
 * 将java.sql.Timestamp对象转化为String字符串
 * 
 * @param time
 *            要格式的java.sql.Timestamp对象
 * @param strFormat
 *            输出的String字符串格式的限定（如："yyyy-MM-dd HH:mm:ss"）
 * @return 表示日期的字符串
 */
public static String dateToStr(java.sql.Timestamp time, String strFormat) {
    DateFormat df = new SimpleDateFormat(strFormat);
    String str = df.format(time);
    return str;
}

/**
 * 将java.sql.Timestamp对象转化为java.util.Date对象
 * 
 * @param time
 *            要转化的java.sql.Timestamp对象
 * @return 转化后的java.util.Date对象
 */
public static java.util.Date timeToDate(java.sql.Timestamp time) {
    return time;
}

/**
 * 将java.util.Date对象转化为java.sql.Timestamp对象
 * 
 * @param date
 *            要转化的java.util.Date对象
 * @return 转化后的java.sql.Timestamp对象
 */
public static java.sql.Timestamp dateToTime(java.util.Date date) {
    String strDate = dateToStr(date, "yyyy-MM-dd HH:mm:ss SSS");
    return strToSqlDate(strDate, "yyyy-MM-dd HH:mm:ss SSS");
}

/**
 * 返回表示系统当前时间的java.util.Date对象
 * @return  返回表示系统当前时间的java.util.Date对象
 */
public static java.util.Date nowDate(){
    return new java.util.Date();
}

/**
 * 返回表示系统当前时间的java.sql.Timestamp对象
 * @return  返回表示系统当前时间的java.sql.Timestamp对象
 */
public static java.sql.Timestamp nowTime(){
    return dateToTime(new java.util.Date());
}

}
