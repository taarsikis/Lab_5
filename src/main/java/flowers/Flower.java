package flowers;
import lombok.*;

import java.util.Arrays;

@AllArgsConstructor @Getter @Setter
public class Flower {
    private double sepalLength;
    private int[] color;
    private double price;
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType){
        this.flowerType = FlowerType.TULIP;
    }

    public String toString() {
        return flowerType +
                ", color=" + Arrays.toString(color) +
                ", price=" + price;
    }
}
