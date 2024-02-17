package feb13.abstractt;

public class MainPhone {
    public static void main(String[] args) {
        Mobile mob = new SmartPhone() {
            @Override
            public void internet() {

            }
        };
    }
}
