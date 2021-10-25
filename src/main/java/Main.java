import flowers.Flower;
import flowers.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(FlowerType.ROSE);
        Flower tulip = new Flower(FlowerType.TULIP);
        FlowerPack rosePack = new FlowerPack();
        FlowerPack tulipPack = new FlowerPack();
        FlowerBucket bucket = new FlowerBucket();
        Store store = new Store();
        rose.setPrice(10);
        tulip.setPrice(5);
        rosePack.setFlower(rose);
        rosePack.setAmount(10);
        tulipPack.setFlower(tulip);
        tulipPack.setAmount(5);
        bucket.addFlowerPack(tulipPack);
        bucket.addFlowerPack(rosePack);
        bucket.setName("Весільний");
        store.addBucket(bucket);
        FlowerBucket find = store.searchBucket("Весільн1ий");
        System.out.println(find.getName());
    }
}
