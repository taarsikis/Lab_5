import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> buckets = new ArrayList<FlowerBucket>();

    public void addBucket(FlowerBucket newBucket){
        buckets.add(newBucket);
    }

    public FlowerBucket searchBucket(String bucketName) {
        for (int i = 0; i < buckets.size(); i++) {
            if (bucketName == buckets.get(i).getName()) {
                return buckets.get(i);
            }
        }
        return new FlowerBucket();
    }
}