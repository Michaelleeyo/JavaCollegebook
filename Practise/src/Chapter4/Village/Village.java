package Chapter4.Village;

public class Village {
    static int waterAmount;
    int PeopleNumber;
    String name;

    Village(String s) {
        name = s;
    }

    static void setWaterAmount(int m) {
        if (m > 0)
            waterAmount = m;
    }

    void drinkWater(int n) {
        if (waterAmount - n >= 0) {
            waterAmount = waterAmount - n;
            System.out.println(name + "����" + n + "��ˮ");
        } else
            waterAmount = 0;
    }

    static int lookWaterAmount() {
        return waterAmount;
    }

    void setPeopleNumber(int n) {
        PeopleNumber = n;
    }

    int getPeopleNumber() {
        return PeopleNumber;
    }
}
