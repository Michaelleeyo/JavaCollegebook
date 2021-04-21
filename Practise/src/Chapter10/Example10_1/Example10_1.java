package Chapter10.Example10_1;

import java.io.*;

public class Example10_1 {
    public static void main(String args[]) {
        File f = new File("C:\\ch10", "Chapter10.Example10_1.java");
        System.out.println(f.getName() + "是可读的吗:" + f.canRead());
        System.out.println(f.getName() + "的长度:" + f.length());
        System.out.println(f.getName() + "的绝对路径:" + f.getAbsolutePath());
        File file = new File("new.text");
        System.out.println("在当前目录下创建新文件" + file.getName());
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("创建成功");
            } catch (IOException exp) {
            }
        }
    }
}
