package command;

import java.util.LinkedList;

// rolul de Invoker
public class VMCK {

   private LinkedList<Command> stack = new LinkedList<>();
   /*
   push -> push()
   pop -> remove()
    */


   public void execute(Command command) {

      stack.push(command);
      command.execute();
   }

   public void undo() {
      // pop
      Command commandToUndo = stack.remove();
      // sa apelam undo din comanda
      commandToUndo.undo();
   }

   public LinkedList<Command> getStack() {
      return stack;
   }

   public void setStack(LinkedList<Command> stack) {
      this.stack = stack;
   }
}
