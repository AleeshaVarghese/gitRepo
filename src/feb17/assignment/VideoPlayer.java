package feb17.assignment;

public class VideoPlayer extends MediaDevice implements Playable{
    String title;
    String duration;

    public VideoPlayer(String name, String title, String duration) {
        super(name);
        this.title = title;
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println("Media "+ name);
        System.out.println("Video Title : "+title);
        System.out.println("Video Duration : "+duration);
    }

    @Override
    public void play() {
        System.out.println("Play the video");
    }
}
