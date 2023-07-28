package Classes.Rewards.Coin;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class CoinFabric extends ItemGenerator  {
     @Override
    public iGameItem createItem() {
        return new Coin();
    } 
}
