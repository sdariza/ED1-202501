public class App {
    public static void main(String[] args) throws Exception {

        Stack myStack = new Stack(7);
        for (int i = 0; i < 10; i++) {
            myStack.addStack(i);
        }
        myStack.traversal();
        for (int i = 0; i < 10; i++) {
            String deletedElem = myStack.pop();
            if (deletedElem != null) {
                System.out.println("Elemento eliminado: "+ deletedElem);
            }else{
                System.out.println("No hay elementos ");
            }
        }
        myStack.traversal();
    }
}
