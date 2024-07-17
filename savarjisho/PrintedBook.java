public class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook(String title, String author, String ISBN, int pageCount) {
        super(title, author, ISBN);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}

