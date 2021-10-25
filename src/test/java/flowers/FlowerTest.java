package flowers;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flower.setSepalLength(11.12);
        flower.setColor(new int[]{127,0,0});
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(11.12, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals( 10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals( FlowerType.ROSE, flower.getFlowerType());
    }


}