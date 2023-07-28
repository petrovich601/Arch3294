package Classes.Rewards.Coin;

import Classes.iGameItem;

public class Coin implements iGameItem {
    @Override
    public void open() {
        System.out.println("Coin!");
    }
}
