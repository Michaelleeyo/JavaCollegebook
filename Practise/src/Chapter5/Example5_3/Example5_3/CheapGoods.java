package Example5_3;

public class CheapGoods extends Goods {
    public int weight;

    public void newSetWeight(int w) {
        weight = w;
        System.out.println("int 型的weight=" + weight);
    }

    public double newGetPrice() {
        double price = weight * 10;
        return price;
    }
}
