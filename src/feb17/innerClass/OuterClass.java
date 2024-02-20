package feb17.innerClass;

public class OuterClass {
    int x = 10;
    void outerMethod(){
        System.out.println("Outer method x : "+x);
    }
    class Inner{
        int y = 20;
        void innerMethod(){
            System.out.println("Inner Method");
            System.out.println("x : "+x);
            System.out.println("y : "+y);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();

        OuterClass.Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}

