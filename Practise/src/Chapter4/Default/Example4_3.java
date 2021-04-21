package Chapter4.Default;

class Xiyoujirenwu {
    float height, weight;
    String head, ear;

    void speak(String s) {
        head = "����ͷ";
        System.out.println(s);
    }
}

public class Example4_3 {
    public static void main(String[] args) {
        Xiyoujirenwu zhubajie, sunwukong;
        zhubajie = new Xiyoujirenwu();
        sunwukong = new Xiyoujirenwu();
        zhubajie.height = 1.80f;
        zhubajie.ear = "�����";
        zhubajie.head = "��ͷ";
        sunwukong.head = "����ƮƮ";
        sunwukong.height = 1.62f;
        sunwukong.weight = 1000f;
        System.out.println("zhubajie�����:" + zhubajie.height);
        System.out.println("zhubajie��ͷ:" + zhubajie.head);
        System.out.println("sunwukong��ͷ:" + sunwukong.head);
        System.out.println("suwukong������:" + sunwukong.weight);
        zhubajie.speak("��������Ȣϱ��");
        System.out.println("zhubajie���ڵ�ͷ" + zhubajie.head);
        sunwukong.speak("��������1000�����ƭ�˽䱳��");
        System.out.println("sunwukong���ڵ�ͷ��" + sunwukong.head);

    }

}
