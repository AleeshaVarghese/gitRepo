package jan27;

public class CounterMain {
    public static void main(String[] args) {
        CounterIncrement count1 = new CounterIncrement();
        CounterIncrement count2 = new CounterIncrement();
        CounterIncrement count3 = new CounterIncrement();
        CounterIncrement count4 = new CounterIncrement();

        count1.increment();
        count2.increment();
        count3.increment();
        count4.increment();
    }
}
