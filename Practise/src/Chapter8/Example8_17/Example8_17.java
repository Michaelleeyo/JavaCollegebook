package Chapter8.Example8_17;

import java.util.*;

public class Example8_17 {
    public static void main(String args[]) {
        Date nowTime = new Date();
        System.out.println(nowTime);
        String pattern = "%tY-%<tm-&<td(%<tA)%<tT";
        String s = String.format(pattern, nowTime);
        System.out.println(s);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, 11, 31, 05, 15, 59);
        s = String.format("%tY年%<tb%<tT日<%<tT，所在时区%<tZ与GMT相差：%<tz小时", calendar);
        System.out.println(s);
    }
}
//tY将日期中的“年”格式化为4位形式
//ty将日期中的“年”格式化为2位形式
//%tm将日期中的“月”格式化为2位形式
//%tp将“日”格式化为当前环境下上午和下午的表示格式，am,pm
//td将“日”格式化为当月中的天，01~31
//tj将“日”格式化为当年的天数，001~365
//%tB将“月”格式化为当前环境下的月份全称，January,February
//%tb将“月”格式为当前环境下月份的简称，Jan,Feb
//%tA将“日”格式化为当前环境下星期几的全称，Monday,Tuesday
//%ta将“日”格式化为当前环境下星期几的简称，Mon,Tue
//%tH将“时”格式化为2为形式，00~23
//%tI将“时”格式化为2位形式，01~12
//%tM将“分”格式化位2位形式，即00~60
//%tS将“秒”格式化为2位形式，即00~60
//%tL将“毫秒”格式化为3位形式
