package Chapter6.Example6_3;

public class Example6_3 {
    public static void main(String args[]) {
        ShowMessage sm;                //声明接口变量
        sm = new TV();                 //接口变量中存放对象的引用
        sm.显示商标("长城牌电视机"); //接口回调
        sm = new pc();                 //接口变量中存放对象的引用
        sm.显示商标("联想电脑");    //接口回调
    }
}
