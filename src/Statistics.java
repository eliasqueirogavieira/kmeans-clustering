package src;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public final class Statistics {
    private List<Double> list;
    private DoubleSummaryStatistics dss;

    public Statistics(List<Double> list) {
        this.list = list;
        dss = list.stream().collect(Collectors.summarizingDouble(d -> d));
    }

    public double sum() {
        return dss.getSum();
    }

    //Find the average (mean)
    public double mean(){
        return dss.getAverage();
    }

    // Find the variance sum((x-mean)^2)/n
    public double variance(){
        double mean = this.mean();
        return list.stream().mapToDouble(x -> Math.pow((x - mean), 2)).average().getAsDouble();
    }

    // Find the standard deviation sqrt(variance)
    public double std(){
        return Math.sqrt(this.variance());
    }

    // Convert elements to respective z-scores (formula z-score = (x-mean)/standardDeviation)
    public List<Double> zscored() {
        double mean = this.mean();
        double std = this.std();
        return list.stream().map(x -> std != 0 ? ((x - mean)/std) : 0.0).collect(Collectors.toList());
    }

    public double max(){
        return dss.getMax();
    }

    public double min(){
        return dss.getMin();
    }
}
