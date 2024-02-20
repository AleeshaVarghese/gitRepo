package feb17.annonymous;
public class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass() {
            @Override
            void outer() {
                System.out.println("Outer method");
            }
        };
        out.outer();
    }
}
