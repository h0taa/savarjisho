public abstract class LibraryItem {
    private int id;

    public LibraryItem(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract String getDescription();
}

