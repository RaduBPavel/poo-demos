package chainOfResponsibility;

public class Request {

    private String query;

    public Request(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
