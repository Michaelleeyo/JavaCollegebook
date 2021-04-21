package Chapter8.Example8_5;

import java.util.Date;

public class Example8_5 {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date.toString());
        TV tv = new TV("长虹电视");
        System.out.println(tv.toString());
    }
}
