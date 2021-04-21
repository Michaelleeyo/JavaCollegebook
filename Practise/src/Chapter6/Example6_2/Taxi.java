package Chapter6.Example6_2;

class Taxi extends MotorVehicles implements MoneyFare, ControlTemperature {
    void brake() {
        System.out.println("出租车使用盘式刹车技术");
    }

    public void charge() {
        System.out.println("出租车：2元每公里，起步价三公里");
    }

    public void controlAirTemperature() {
        System.out.println("出租车安装了Hair空调");
    }
}
