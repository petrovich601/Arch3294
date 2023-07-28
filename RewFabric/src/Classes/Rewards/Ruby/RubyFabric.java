package Classes.Rewards.Ruby;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class RubyFabric extends ItemGenerator  {
     @Override
    public iGameItem createItem() {
        return new Ruby();
    }  
}
