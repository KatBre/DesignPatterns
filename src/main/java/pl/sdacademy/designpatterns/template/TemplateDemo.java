package pl.sdacademy.designpatterns.template;

public class TemplateDemo {
    public static void main(String[] args) {
        final PerformanceTemplate test = SortingPerformanceTest();
        test.run();
    }
}
