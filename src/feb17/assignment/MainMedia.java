package feb17.assignment;

public class MainMedia {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer("Audio", "Katchi sera" , "Albin");
        VideoPlayer vp = new VideoPlayer("Video","BirthVlog", "Pearly");
        ImageDisplay id = new ImageDisplay("Image", "Engagement Image", "20x12");

        ap.displayDetails();
        ap.play();
        System.out.println("*********************");
        vp.displayDetails();
        vp.play();
        System.out.println("*********************");
        id.displayDetails();
        id.displayImage();

    }
}
