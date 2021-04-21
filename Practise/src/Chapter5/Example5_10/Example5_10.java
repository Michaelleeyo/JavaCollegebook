package Chapter5.Example5_10;

public class Example5_10 {
    public static void main(String args[]) {
        类人猿 monkey = new People();  //monkey是people的上转型对象
        monkey.crySpeak("I love you!");
        People people = (People) monkey;  //把上转型对象强制转换为子类的对象
        people.computer(10, 10);
    }
}
//上转型对象
//Animal a;
//Tiger b = new Tiger();
//a = b;