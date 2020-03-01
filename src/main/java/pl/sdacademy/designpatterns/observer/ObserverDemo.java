package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        final Subject subject = new Subject();
        final Observer observerA = new SpecificValueObserver(subject);
        final Observer observerB = new ValueLoweredObserver(subject);
        final Observer observerC = new ByTenChangedObserver(subject);
        subject.changeStateBy(-1);
        subject.changeStateBy(2);
        subject.changeStateBy(13);
        subject.changeStateBy(1);
        subject.changeStateBy(-5);

    }
}
