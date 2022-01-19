package main;

public class MyGenericElement<E> { // E -> placeholder
    // MyGenericElement<Integer>
    E element; // Integer element

    public MyGenericElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
