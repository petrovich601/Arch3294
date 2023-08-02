package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {


    private long card;
    private int balance;
    private long oldCard;

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        int balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    public long getCard() {
        return 0;
    }

    public int getBalance() {
        return 0;
    }

    public void setBalance(int i) {
    }
}
