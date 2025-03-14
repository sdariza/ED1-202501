public class SimpleList extends List {

    @Override
    void addStack(int theData) {
        Node newNode = new Node(theData);
        if (first == null)
            first = newNode;
        else
            newNode.next = first;
        first = newNode;
    }

    @Override
    void addQueue(int theData) {
        Node newNode = new Node(theData);
        if (first == null)
            first = newNode;
        else {
            Node aux = first;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = newNode;
        }
    }

    @Override
    void traversal() {
        if (first == null)
            System.out.println("Empty list");
        else {
            System.out.println("Elementos en la lista:");
            Node aux = first;
            while (aux != null) {
                System.out.print(aux.data + "|");
                aux = aux.next;
            }
            System.out.println();
        }
    }

    @Override
    void delete(int theData) {
        // TODO Auto-generated method stub
    }

    @Override
    Node search(int theData) {
        Node aux = first;
        while (aux != null) {
            if (aux.data == theData)
                return aux;
            else
                aux = aux.next;
        }
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
