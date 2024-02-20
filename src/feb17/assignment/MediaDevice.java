package feb17.assignment;

public abstract class MediaDevice {

    String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    abstract void displayDetails();
}
