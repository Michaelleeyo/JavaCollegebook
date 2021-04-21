package Chapter5.Example5_8;

public class UniverStudent extends Student {
    boolean 婚否;

    UniverStudent(int number, String name, boolean b) {
        super(number, name);
        婚否 = b;
        System.out.println("婚否=" + 婚否);
    }
}
