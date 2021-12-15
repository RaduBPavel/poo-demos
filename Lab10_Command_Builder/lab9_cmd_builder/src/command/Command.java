package command;

public abstract class Command {

    private int ID;

    public Command(int ID) {
        this.ID = ID;
    }

    public abstract void execute();

    public abstract void undo();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
