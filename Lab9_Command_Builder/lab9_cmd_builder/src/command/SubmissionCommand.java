package command;

public class SubmissionCommand extends Command{

    // referinta catre Receiver
    private final User user;
    // camp aditional
    private int date;

    // pt cele previous
    private int datePrevious;
    private int IDPrevious;

    public SubmissionCommand(User user, int date, int ID) {
        super(ID);
        this.user = user;
        this.date = date;
    }

    @Override
    public void execute() {

        this.datePrevious = this.user.getSubmissionDate();
        this.IDPrevious = this.user.getSubmissionID();

        this.user.setSubmissionID(this.getID());
        this.user.setSubmissionDate(this.date);
    }

    @Override
    public void undo() {

        date = datePrevious;
        this.setID(IDPrevious);


        datePrevious = user.getSubmissionDate();
        IDPrevious = user.getSubmissionID();

        user.setSubmissionID(this.getID());
        user.setSubmissionDate(this.date);
    }

    @Override
    public String toString() {
        return "SubmissionCommand{" +
                "user=" + user +
                ", date=" + date +
                ", datePrevious=" + datePrevious +
                ", IDPrevious=" + IDPrevious +
                '}';
    }
}
