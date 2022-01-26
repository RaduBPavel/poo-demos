package chainOfResponsibility;

public interface Chain {

    public void setNextChain(Chain nextChain);


    public void calculate(Request request);

}
