public class Book {
    String title;
    String author;
    Page my_page;

    public Book(String title, String author) {
        this.title = title;
        this.author = author; // asociere
        this.my_page = new Page(10); // compunere
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
