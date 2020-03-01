package pl.sdacademy.designpatterns.template;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class SortingPerformanceTest extends PerformanceTemplate {
    @Override
    protected int getWarmupItrationNum() {
        return 2;
    }

    @Override
    protected int getIterationNum() {
        return 100;
    }

    @Override
    protected void iteration() {
        final List<Long> longs = Stream.generate(() -> new Random().nextInt());
        

    }
}
