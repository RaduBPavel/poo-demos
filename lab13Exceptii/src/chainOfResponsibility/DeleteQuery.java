package chainOfResponsibility;

public class DeleteQuery implements Chain {

    public Chain next;

    @Override
    public void setNextChain(Chain nextChain) {
        next = nextChain; // legatura la urmatorul din linked list
    }

    @Override
    public void calculate(Request request) {
        if(request.getQuery().equals("DELETE")) {
            System.out.println("am sters din baza de date");
        } else {
            next.calculate(request);
        }
    }
}
