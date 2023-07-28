import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.Coin.CoinFabric;
import Classes.Rewards.Gem.GemFabric;
import Classes.Rewards.Gold.GoldFabric;
import Classes.Rewards.Pearl.PearlFabric;
import Classes.Rewards.Ruby.RubyFabric;
import Classes.Rewards.Sapphire.SapphireFabric;
import Classes.Rewards.Silver.SilverFabric;

// "Точка входа"

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator GoldFabric = new GoldFabric();
        ItemGenerator GemFabric = new GemFabric();
        ItemGenerator CoinFabric = new CoinFabric();
        ItemGenerator PearlFabric = new PearlFabric();
        ItemGenerator RubyFabric = new RubyFabric();
        ItemGenerator SapphireFabric = new SapphireFabric();
        ItemGenerator SilverFabric = new SilverFabric();
        
       
        List<ItemGenerator> fabricList = new ArrayList<>(
            Arrays.asList(GoldFabric,
                    GemFabric, 
                    CoinFabric, 
                    PearlFabric, 
                    PearlFabric,
                    RubyFabric,
                    SapphireFabric,
                    SilverFabric));

        for(int i=0;i<20;i++)
        {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}
