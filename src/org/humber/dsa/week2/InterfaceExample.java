package org.humber.dsa.week2;

// Define an interface "Playable" for multimedia playback
interface Playable {
    void play();
    void pause();
    void stop();
}

// Implement the "Playable" interface for two multimedia types: Audio and Video
class AudioPlayer implements Playable {
    private final String audioFile;

    public AudioPlayer(String audioFile) {
        this.audioFile = audioFile;
    }

    @Override
    public void play() {
        System.out.println("Playing audio file: " + audioFile);
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio playback");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio playback");
    }
}

class VideoPlayer implements Playable {
    private final String videoFile;

    public VideoPlayer(String videoFile) {
        this.videoFile = videoFile;
    }

    @Override
    public void play() {
        System.out.println("Playing video file: " + videoFile);
    }

    @Override
    public void pause() {
        System.out.println("Pausing video playback");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video playback");
    }
}

// Create objects of AudioPlayer and VideoPlayer and call their methods
public class InterfaceExample {

    public static void main(String[] args) {

        Playable audio = new AudioPlayer("music.mp3");
        Playable video = new VideoPlayer("movie.mp4");

        // Use polymorphism to call playback methods on different media types
        audio.play();
        audio.pause();
        audio.stop();

        System.out.println();

        video.play();
        video.pause();
        video.stop();
    }
}
