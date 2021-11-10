package commands;

// La nivel de implementare, cine ar fi scris cod ar fi putut din greseala
// sa instantieze un Command, ceea ce e impotriva logicii programului
// pentru ca Command e doar o notiune abstracta pe care se construiesc celelalte componente
public abstract class Command {
    int arg1;
    int arg2;

    public abstract void doSomething();
}
