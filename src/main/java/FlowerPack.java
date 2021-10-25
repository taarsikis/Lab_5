import flowers.Flower;
import lombok.Setter;
import lombok.ToString;

@Setter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public double getPrice(){
        return this.amount * this.flower.getPrice();
    }

    @Override
    public String toString() {
        return  "(" +
                flower +
                ", amount=" + amount +
                ')';
    }
}
