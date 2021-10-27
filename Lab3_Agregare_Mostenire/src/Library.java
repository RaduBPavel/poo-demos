public class Library {
    String name;
    Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }
}
