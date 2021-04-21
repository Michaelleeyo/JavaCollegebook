package Chapter4.Bank;

public class SaveMoney {
    public static void main(String args[]) {
        int amount = 8000;
        ConstructionBank bank1 = new ConstructionBank();
        bank1.savedMoney = amount;
        bank1.year = 8.236;
        bank1.setInterestRate(0.035);
        double interest1 = bank1.computerInterest();
        BankOfDalian bank2 = new BankOfDalian();
        bank2.savedMoney = amount;
        bank2.year = 8.236;
        bank2.setInterestRate(0.035);
        double interst2 = bank2.computerInterest();
        System.out.printf("两个银行利息差：%f元\n", interst2 - interest1);
    }
}
