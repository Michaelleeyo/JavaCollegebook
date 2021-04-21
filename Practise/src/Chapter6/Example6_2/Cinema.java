package Chapter6.Example6_2;

class Cinema implements MoneyFare, ControlTemperature {
    public void charge() {
        System.out.println("电影院：门票，十元每张");
    }

    public void controlAirTemperature() {
        System.out.println("电影院安装了中央空调");
    }
}
