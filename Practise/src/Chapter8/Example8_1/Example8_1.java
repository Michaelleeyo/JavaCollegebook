package Chapter8.Example8_1;

public class Example8_1 {
    public static void main(String args[]) {
        String s1, s2;
        s1 = new String("天道酬勤");
        s2 = new String("天道酬勤");
        System.out.println(s1.equals(s2));
        //equal(String s)方法比较当前字符串对象的实体是否与参数s指定的字符串的实体相同
        System.out.println(s1 == s2);
        String s3, s4;
        s3 = "勇者无敌";
        s4 = "勇者无敌";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
    }
}
