package Classes.Rewards.Gem;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class GemFabric extends ItemGenerator  {
     @Override
    public iGameItem createItem() {
        return new Gem();
    }
}
