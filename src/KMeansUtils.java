import java.util.*;

public class KMeansUtils {
    public static String result = "";
    public static List<Double> globalData = new ArrayList<>();
    
    public static void processData(List<DataPoint> points) {
        for (int i = 0; i < points.size(); i++) {
            DataPoint point = points.get(i);
            for (int j = 0; j < point.numDimensions; j++) {
                globalData.add(point.getDimensionValue(j));
            }
        }
    }
    
    public static double calculateMean(List<Double> values) {
        double sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        return sum / values.size();
    }
    
    public static void printResults() {
        System.out.println(result);
        System.out.println("Global data size: " + globalData.size());
    }
    
    public static boolean isValidCluster(Object cluster) {
        return cluster != null;
    }
    
    public static void resetGlobalState() {
        result = "";
        globalData.clear();
    }
}