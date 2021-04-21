package Chapter4.Village;

public class Land {

    public static void main(String[] args) {
        Village.setWaterAmount(200);
        int leftWater = Village.waterAmount;
        System.out.println("ˮ������ˮ" + leftWater + "��ˮ");
        Village zhaoZhuang, maJiaHeZhi;
        zhaoZhuang = new Village("��ׯ");
        maJiaHeZhi = new Village("��Һ���");
        zhaoZhuang.setPeopleNumber(80);
        maJiaHeZhi.setPeopleNumber(120);
        zhaoZhuang.drinkWater(50);
        leftWater = maJiaHeZhi.lookWaterAmount();
        String name = maJiaHeZhi.name;
        System.out.println(name + "����ˮ������ˮ" + leftWater);
        maJiaHeZhi.drinkWater(100);
        leftWater = zhaoZhuang.lookWaterAmount();
        name = zhaoZhuang.name;
        System.out.println(name + "����ˮ������ˮ" + leftWater);
        int PeopleNumber = zhaoZhuang.getPeopleNumber();
        System.out.println("��ׯ���˿�" + PeopleNumber);
        PeopleNumber = maJiaHeZhi.getPeopleNumber();
        System.out.println("���˿�" + PeopleNumber);
    }

}
