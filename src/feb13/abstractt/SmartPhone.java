package feb13.abstractt;

public abstract class SmartPhone extends Mobile {
    public abstract void internet();
   @Override
    public void cordless(){
        System.out.println("cord less call");
    }
}
