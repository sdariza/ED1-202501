public class ejerciciosDoblementeEnlazadas {
    public static void main(String[] args) {
        // creación de lista #1
        SimpleDoubleLinkedList myDoubleLinkedList = new SimpleDoubleLinkedList();
        myDoubleLinkedList.addQueue(10);
        myDoubleLinkedList.addQueue(20);
        myDoubleLinkedList.addQueue(30);
        myDoubleLinkedList.addQueue(40);
        myDoubleLinkedList.addQueue(130);
        myDoubleLinkedList.addQueue(150);
        myDoubleLinkedList.addQueue(1300);
        myDoubleLinkedList.traversalRight();
        // creación de lista #2
        SimpleDoubleLinkedList doublelinked2 = new SimpleDoubleLinkedList();
        doublelinked2.addQueue(5);
        doublelinked2.addQueue(20);
        doublelinked2.addQueue(35);
        doublelinked2.addQueue(48);
        doublelinked2.addQueue(100);
        doublelinked2.traversalRight();

        // ejercicio 1:
        /*
         * Hacer un algoritmo que, dadas dos listas doblemente enlazadas ordenadas ya
         * creadas, una a la lista que contenga el mayor número de nodos la otra lista,
         * de
         * forma tal que continúen ordenadas.
         */

        SimpleDoubleLinkedList lista, list;
        if (myDoubleLinkedList.size() > doublelinked2.size()) {
            lista = myDoubleLinkedList;
            list = doublelinked2;
        } else {
            lista = doublelinked2;
            list = myDoubleLinkedList;
        }

        System.out.println("la lista más larga es: ");
        lista.traversalRight();
        System.out.println("la más corta es: ");
        list.traversalRight();

        DoubleNode n1, n2, aux = null, aux2;
        n1 = list.first;
        n2 = lista.first;

        for (int i = 0; i < list.size();) {
            System.out.println("n1: " + n1.getData());
            System.out.println("n2: " + n2.getData());

            while (n2.getData() < n1.getData()) {
                System.out.println(n2.getData() + " es menor que " + n1.getData());
                n2 = n2.getRight();
            }
            System.out.println(n2.getData() + " es mayor/igual que " + n1.getData());
            if (n1 == list.first) {
                list.first = n1.getRight();
            }
            aux = n1.getRight();
            aux2 = n2.getLeft();
            n2.setLeft(n1);
            n2.getLeft().setRight(n2);

            if (n2 == lista.first) {
                lista.first = n2.getLeft();
            } else {
                aux2.setRight(n1);
                n1.setLeft(aux2);
            }
            n1 = aux;

            lista.traversalRight();
        }
    }
}
