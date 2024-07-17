import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<Book> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }

        @Override
        public Book next() {
            return books.get(currentIndex++);
        }
    }
}
