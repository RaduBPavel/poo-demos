package command;

public class User {

    private String name;
    private int submissionID;
    private int submissionDate;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubmissionID() {
        return submissionID;
    }

    public void setSubmissionID(int submissionID) {
        this.submissionID = submissionID;
    }

    public int getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(int submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", submissionID=" + submissionID +
                ", submissionDate=" + submissionDate +
                '}';
    }
}
