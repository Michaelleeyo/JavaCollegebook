package Chapter5.Example5_8;

public class Student {
    int number;
    String name;

    Student() {
    }

    Student(int number, String name) {
        this.number = number;
        this.name = name;
        System.out.println("我的名字是：" + name + "我的学号是：" + number);
    }
}
