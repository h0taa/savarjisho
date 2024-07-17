public class AudioBook extends Book {
    private double duration; // in hours

    public AudioBook(String title, String author, String ISBN, double duration) {
        super(title, author, ISBN);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }
}

