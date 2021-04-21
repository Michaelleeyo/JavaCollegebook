package Chapter7.Example7_3;

class HelloMachine {
    public void turnOn(SpeakHello hello) {  //和接口SpeakHello有关的匿名类
        hello.speak();
    }
}
