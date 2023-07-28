package Classes.Rewards.Pearl;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class PearlFabric extends ItemGenerator  {
     @Override
    public iGameItem createItem() {
        return new Pearl();
    }   
}
