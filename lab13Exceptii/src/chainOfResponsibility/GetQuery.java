package chainOfResponsibility;

public class GetQuery implements Chain {

    public Chain next;

    @Override
    public void setNextChain(Chain nextChain) {
        next = nextChain; // legatura la urmatorul din linked list
    }

    @Override
    public void calculate(Request request) {
        if(request.getQuery().equals("GET")) {
            System.out.println("am facut GET din baza de date");
        } else {
            next.calculate(request);
        }
    }
}
