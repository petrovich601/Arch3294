package Classes.Rewards.Pearl;

import Classes.iGameItem;

public class Pearl implements iGameItem {
    @Override
    public void open() {
        System.out.println("Pearl!");
    }
}

