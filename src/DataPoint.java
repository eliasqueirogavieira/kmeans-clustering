import java.util.ArrayList;
import java.util.List;

public class DataPoint {
    public final int numDimensions;
    private List<Double> originals;
    public List<Double> dimensions;

    public DataPoint(List<Double> initials) {
        originals = initials;
        dimensions = new ArrayList<>(initials);
        numDimensions = dimensions.size();
    }

    public double distance(DataPoint other) {
        double differences = 0.0;
        for (int i = 0; i < numDimensions; i++) {
            double difference = dimensions.get(i) - other.dimensions.get(i);
            differences += difference * difference;
        }
        return Math.sqrt(differences);
    }

    @Override
    public String toString() {
        return originals.toString();
    }

    public void updateDimension(int index, double value) {
        dimensions.set(index, value);
    }

    public double getDimensionValue(int index) {
        return dimensions.get(index);
    }
}