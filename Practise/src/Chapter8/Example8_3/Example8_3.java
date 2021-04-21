package Chapter8.Example8_3;

public class Example8_3 {
    public static void main(String args[]) {
        String path = "c:\\book\\javabook\\JavaProgrammer.doc";
        int index = path.indexOf("\\");
        index = path.indexOf("\\", index);
        String sub = path.substring(index);
        System.out.println(sub);
        index = path.lastIndexOf("\\");
        sub = path.substring(index + 1);
        System.out.println(sub);
        System.out.println(sub.contains("Programmer"));
    }
}
