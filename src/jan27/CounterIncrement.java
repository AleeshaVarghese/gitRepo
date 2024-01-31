package jan27;

public class CounterIncrement {

    static int count = 0;

    public CounterIncrement() {
        this.count = count;
    }

    public void increment(){
        count++;
        System.out.println("counter "+count);
    }
}
