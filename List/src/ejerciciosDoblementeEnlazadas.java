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

        while (n1 != null) {
            System.out.println("n1: " + n1.getData());
            System.out.println("n2: " + n2.getData());

            while (n2.getData() < n1.getData()) {
                System.out.println(n2.getData() + " es menor que " + n1.getData());
                n2 = n2.getRight();
            }
            System.out.println(n2.getData() + " es mayor/igual que " + n1.getData());
            list.first = n1.getRight();
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
        // EJERCICIO 2:
        /*
         * Dadas dos listas DOBLEMENTE ENLAZADAS ORDENADAS ascendentemente ya
         * creadas, PTR1 y PTR2, hacer un algoritmo que elimine de la lista PTR1 los
         * elementos de PTR1 que no estén en PTR2. El resultado de la lista PTR1 debe
         * mostrarse en forma descendente.
         */
        System.out.println(" ");
        System.out.println("----------------*----------------");
        System.out.println("EJERCICIO 2: ");
        SimpleDoubleLinkedList PTR1 = new SimpleDoubleLinkedList();
        PTR1.addQueue(1);
        PTR1.addQueue(2);
        PTR1.addQueue(3);
        PTR1.addQueue(4);
        PTR1.addQueue(13);
        SimpleDoubleLinkedList PTR2 = new SimpleDoubleLinkedList();
        PTR2.addQueue(2);
        PTR2.addQueue(3);
        PTR2.addQueue(5);
        PTR2.addQueue(8);
        PTR2.addQueue(13);
        System.out.println("Lista PTR1:");
        PTR1.traversalRight();
        System.out.println("Lista PTR2:");
        PTR2.traversalRight();
        n1 = PTR1.first;
        n2 = PTR2.first;

        while (n1 != null) {
            boolean d = true;
            while (n1.getData() >= n2.getData() & d == true) {
                if (n1.getData() == n2.getData()) {
                    d = false;
                } else {
                    n2 = n2.getRight();
                }
            }
            if (d) {
                int n = n1.getData();
                System.out.println("se eliminó el: " + n);
                n1 = n1.getRight();
                PTR1.delete(n);
                PTR1.traversalRight();
            } else {
                n1 = n1.getRight();
            }
        }
        System.out.println("Resultado descendente: ");
        PTR1.traversalLeft();

        // EJERCICIO 3:
        /*
         * Dada una lista DOBLEMENTE ENLAZADA ordenada ascendentemente ya
         * creada, PTR1, y otra lista circular que también ya está creada pero que no
         * está
         * ordenada ni se permite hacerlo, llamada PTR2, realice las siguientes
         * operaciones:
         */

        /*
         * a. Tomar los elementos de PTR2 que no están en PTR1 e irlos insertando en
         * la posición correcta de PTR1.
         */

    }
}
