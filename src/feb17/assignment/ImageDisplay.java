package feb17.assignment;

public class ImageDisplay extends MediaDevice{
    String imageName;
    String resolution;

    public ImageDisplay(String name, String imageName, String resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    @Override
    void displayDetails() {
        System.out.println("Media "+ name);
        System.out.println("Image name : "+imageName);
        System.out.println("Image resolution : "+resolution);
    }
    void displayImage(){
        System.out.println("Display Image");
    }
}
