public class CircularSimpleList extends List {

    @Override
    void addStack(int theData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStack'");
    }

    @Override
    void addQueue(int theData) {
        Node newNode = new Node(theData);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            last = newNode;

        }
        last.next = first;
    }

    @Override
    void traversal() {
        if (first == null)
            System.out.println("Empty list");
        else {
            System.out.println("Elementos en la lista:");
            Node aux = first;
            do {
                System.out.print(aux.data + "|");
                aux = aux.next;
            } while (aux != first);
            System.out.println();
        }
    }

    @Override
    Node search(int theData) {
        if (first != null) {
            Node p = first;
            do {
                if (p.data == theData) {
                    return p;
                } else
                    p = p.next;
            } while (p != first);
        }
        return null;
    }

    @Override
    void delete(int theData) {
        if (first != null) {// La lista NO está vacía
            Node antp = first;
            Node p = first.next;
            while (p != first && p.data != theData) {
                antp = p;
                p = p.next;
            }
            if (p.data == theData) {
                antp.next = p.next;
                p.next = null;
                if (p == first) {
                    first = antp.next;
                }
                if (antp.next == null) {
                    last = null;
                } else {
                    if (p == last)
                        last = antp;
                }
            }
        } else
            System.out.println("La lista está vacía");
    }

}
