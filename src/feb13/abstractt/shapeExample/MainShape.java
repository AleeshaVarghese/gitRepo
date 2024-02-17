package feb13.abstractt.shapeExample;

public class MainShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",2);
        Shape s2 = new Rectangle("Blue",2,3);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
