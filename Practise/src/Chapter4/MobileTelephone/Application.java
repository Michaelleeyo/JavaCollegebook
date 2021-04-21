package Chapter4.MobileTelephone;

public class Application {
    public static void main(String args[]) {
        MoblieTelephone telephone = new MoblieTelephone();
        SIM sim = new SIMOfChinaMobile();
        sim.setNumber("123456");
        telephone.useSIM(sim);
        telephone.showMess();
        sim = new SIMOfChinaUnicom();
        sim.setNumber("654321");
        telephone.useSIM(sim);
        telephone.showMess();
    }
}
