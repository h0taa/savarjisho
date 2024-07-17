import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.List;

public class LibraryGUI extends JFrame {
    private Library library;
    private JTable bookTable;

    public LibraryGUI(Library library) {
        this.library = library;

        setTitle("Library Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bookTable = new JTable(new BookTableModel(library));
        add(new JScrollPane(bookTable), BorderLayout.CENTER);

        setVisible(true);
    }

    private class BookTableModel extends AbstractTableModel {
        private Library library;
        private List<Book> books;

        public BookTableModel(Library library) {
            this.library = library;
            this.books = new ArrayList<>();
            for (Book book : library) {
                books.add(book);
            }
        }

        @Override
        public int getRowCount() {
            return books.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Book book = books.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return book.getTitle();
                case 1:
                    return book.getAuthor();
                case 2:
                    return book.getISBN();
            }
            return null;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "Title";
                case 1:
                    return "Author";
                case 2:
                    return "ISBN";
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new PrintedBook("1984", "George Orwell", "1234567890", 328));
        library.addBook(new EBook("To Kill a Mockingbird", "Harper Lee", "2345678901", "http://example.com/tokillamockingbird"));
        library.addBook(new AudioBook("The Great Gatsby", "F. Scott Fitzgerald", "3456789012", 4.5));

        new LibraryGUI(library);
    }
}
