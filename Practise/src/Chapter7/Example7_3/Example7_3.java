package Chapter7.Example7_3;

public class Example7_3 {
    public static void main(String args[]) {
        HelloMachine machine = new HelloMachine();
        machine.turnOn(new SpeakHello() {  //和接口SpaekHello有关的匿名类
                           public void speak() {
                               System.out.println("Hello,you are welcome!");
                           }
                       }
        );
        machine.turnOn(new SpeakHello() {   //和接口SpaekHello有关的匿名类
                           public void speak() {
                               System.out.println("你好，欢迎光临！");
                           }
                       }
        );
    }
}
