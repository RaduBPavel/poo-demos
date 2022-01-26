package chainOfResponsibility;

public class PostQuery implements Chain {

    public Chain next;

    @Override
    public void setNextChain(Chain nextChain) {
        next = nextChain; // legatura la urmatorul din linked list
    }

    @Override
    public void calculate(Request request) {
        if(request.getQuery().equals("POST")) {
            System.out.println("am pus in baza de date");
        } else {
            System.out.println("Sefule poti sa pui doar GET, DELETE si POST");
        }
    }
}
