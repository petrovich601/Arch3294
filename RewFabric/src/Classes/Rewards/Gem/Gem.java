package Classes.Rewards.Gem;

import Classes.iGameItem;

public class Gem implements iGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}