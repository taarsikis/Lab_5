import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    private String name;

    public void addFlowerPack(FlowerPack newFlowerPack){
        flowerPacks.add(newFlowerPack);
    }

    public double getPrice(){
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++){
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        return "Букет " + name + ". Склад:" + flowerPacks;
    }
}
