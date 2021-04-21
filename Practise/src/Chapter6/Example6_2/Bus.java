package Chapter6.Example6_2;

class Bus extends MotorVehicles implements MoneyFare {
    void brake() {
        System.out.println("公交车使用毂式刹车技术");
    }

    public void charge() {
        System.out.println("公共汽车：一元一张，不计算公里数");
    }
}
