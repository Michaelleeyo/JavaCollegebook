package Chapter4.Default;

public class Default {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 2:
                    System.out.print("B");
                case 3:
                    System.out.print("C");
                    break;
                case 4:
                    System.out.print("D");
                case 1:
                    System.out.print("A");
                    break;
            }
        }
    }
}