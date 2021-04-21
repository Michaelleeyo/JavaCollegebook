package Chapter6.Example6_2;

public class Example6_2 {
    public static void main(String args[]) {
        Bus bus101 = new Bus();
        Taxi buleTaxi = new Taxi();
        Cinema redStarCinema = new Cinema();
        bus101.brake();
        bus101.charge();
        buleTaxi.brake();
        buleTaxi.charge();
        buleTaxi.controlAirTemperature();
        redStarCinema.charge();
        redStarCinema.controlAirTemperature();
    }
}
