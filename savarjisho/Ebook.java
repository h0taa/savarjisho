public class EBook extends Book {
    private String downloadUrl;

    public EBook(String title, String author, String ISBN, String downloadUrl) {
        super(title, author, ISBN);
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
}

