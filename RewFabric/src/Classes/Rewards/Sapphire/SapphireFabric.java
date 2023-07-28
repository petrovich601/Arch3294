package Classes.Rewards.Sapphire;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class SapphireFabric extends ItemGenerator  {
     @Override
    public iGameItem createItem() {
        return new Sapphire();
    }
}
