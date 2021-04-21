package Chapter5.Example5_4;

public class ImportantUniversity extends University {
    void enterRule(double math, double english, double chinese) {
        double total = math + english + chinese;
        if (total >= 220)
            System.out.println(total + "分数达到大学录取分数线");
        else
            System.out.println(total + "分数未达到大学录取分数线");
    }
}
