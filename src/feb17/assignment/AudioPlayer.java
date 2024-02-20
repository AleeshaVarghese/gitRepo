package feb17.assignment;

public class AudioPlayer extends MediaDevice implements Playable{

    String audioName;
    String artist;
    public AudioPlayer(String name, String audioName, String artist) {
        super(name);
        this.audioName = audioName;
        this.artist = artist;
    }
    void displayDetails() {
        System.out.println("Media "+ name);
        System.out.println("Audio name : "+audioName);
        System.out.println("Audio artist : "+artist);
    }

    @Override
    public void play() {
        System.out.println("Play the audio");
    }
}
