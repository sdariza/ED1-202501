public class CircularSimpleDoubleLinkedList extends DoubleList {

    @Override
    DoubleNode search(int theData) {
        if (first == null) {
            System.out.println("Empty list");
            return null;
        }

        DoubleNode current = first;
        do {
            if (current.getData() == theData) {
                System.out.println("Found: " + theData);
                return current;
            }
            current = current.getRight();
        } while (current != first);

        System.out.println("Element not found: " + theData);
        return null;
    }

    @Override
    void delete(int theData) {
        if (first == null) {
            System.out.println("Empty list");
            return;
        }

        DoubleNode current = first;
        do {
            if (current.getData() == theData) {
                if (current == first && current == last) {
                    first = last = null;
                } else {
                    current.getLeft().setRight(current.getRight());
                    current.getRight().setLeft(current.getLeft());

                    if (current == first)
                        first = current.getRight();
                    if (current == last)
                        last = current.getLeft();
                }
                System.out.println("Deleted: " + theData);
                return;
            }
            current = current.getRight();
        } while (current != first);

        System.out.println("Element not found: " + theData);
    }

    void addStack(int theData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStack'");
    }

    @Override
    void addQueue(int theData) {
        DoubleNode newNode = new DoubleNode(theData);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.setRight(newNode);
            newNode.setLeft(last);
            last = newNode;
        }
        last.setRight(first);
        first.setLeft(last);
    }

    @Override
    void traversalRight() {
        if (first == null)
            System.out.println("Empty list");
        else {
            System.out.println("Elementos en la lista:");
            DoubleNode aux = first;
            do {
                System.out.print(aux.getData() + "|");
                aux = aux.getRight();
            } while (aux != first);
            System.out.println();
        }
    }

    @Override
    void traversalLeft() {
        if (first == null)
            System.out.println("Empty list");
        else {
            System.out.println("Elementos en la lista:");
            DoubleNode aux = last;
            do {
                System.out.print(aux.getData() + "|");
                aux = aux.getLeft();
            } while (aux != last);
            System.out.println();
        }
    }
}
