package feb17.staticInner;

public class OuterClass {
    static int x = 10;
    void outerMethod(){
        System.out.println("Outer method x : "+x);
    }
    public static class InnerClass{
        int y = 20;
        void innerMethod(){
            System.out.println("Inner Method");
            System.out.println("x : "+x);
            System.out.println("y : "+y);
        }
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.outerMethod();
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.innerMethod();

    }
}
