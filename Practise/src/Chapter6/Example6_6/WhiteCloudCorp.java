package Chapter6.Example6_6;

public class WhiteCloudCorp implements Advertisement {        //PhilipsCorp实现
    public void showAdvertisement() {                         //Advertisement接口
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.printf("飞机重点战斗机，哎yes!\n");
        System.out.println("@@@@@@@@@@@@@@@@@@@");
    }

    public String getCorpName() {
        return "白云有限公司";
    }
}
