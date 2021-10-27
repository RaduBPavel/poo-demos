public class Page {
    int num_words;

    public Page(int num_words) {
        this.num_words = num_words;
    }

    @Override
    public String toString() {
        return "Page{" +
                "num_words=" + num_words +
                '}';
    }
}
