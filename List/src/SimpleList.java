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

    int size() {
        Node p = first;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.next;
        }
        return size;
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
        if (first != null) {
            Node antp = null;
            if (first.data == theData) {
                antp = first.next;
                first.next = null;
                first = antp;
            } else {
                Node p = first;
                while (p.next != null && p.data != theData) {
                    antp = p;
                    p = p.next;
                }
                if (p.data == theData) {
                    antp.next = p.next;
                    p.next = null;
                }
            }
        }
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
