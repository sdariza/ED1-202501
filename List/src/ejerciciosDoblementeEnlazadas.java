public class ejerciciosDoblementeEnlazadas {
    public static void main(String[] args) {
        // creación de lista #1
        /*
         * SimpleDoubleLinkedList myDoubleLinkedList = new SimpleDoubleLinkedList();
         * myDoubleLinkedList.addQueue(10);
         * myDoubleLinkedList.addQueue(20);
         * myDoubleLinkedList.addQueue(30);
         * myDoubleLinkedList.addQueue(40);
         * myDoubleLinkedList.addQueue(130);
         * myDoubleLinkedList.addQueue(150);
         * myDoubleLinkedList.addQueue(1300);
         * myDoubleLinkedList.traversalRight();
         * // creación de lista #2
         * SimpleDoubleLinkedList doublelinked2 = new SimpleDoubleLinkedList();
         * doublelinked2.addQueue(5);
         * doublelinked2.addQueue(20);
         * doublelinked2.addQueue(35);
         * doublelinked2.addQueue(48);
         * doublelinked2.addQueue(100);
         * doublelinked2.traversalRight();
         * 
         * // ejercicio 1:
         * /*
         * Hacer un algoritmo que, dadas dos listas doblemente enlazadas ordenadas ya
         * creadas, una a la lista que contenga el mayor número de nodos la otra lista,
         * de
         * forma tal que continúen ordenadas.
         */

        /*
         * SimpleDoubleLinkedList lista, list;
         * if (myDoubleLinkedList.size() > doublelinked2.size()) {
         * lista = myDoubleLinkedList;
         * list = doublelinked2;
         * } else {
         * lista = doublelinked2;
         * list = myDoubleLinkedList;
         * }
         * 
         * System.out.println("la lista más larga es: ");
         * lista.traversalRight();
         * System.out.println("la más corta es: ");
         * list.traversalRight();
         * 
         * DoubleNode n1, n2, aux = null, aux2;
         * n1 = list.first;
         * n2 = lista.first;
         * 
         * while (n1 != null) {
         * System.out.println("n1: " + n1.getData());
         * System.out.println("n2: " + n2.getData());
         * 
         * while (n2.getData() < n1.getData()) {
         * System.out.println(n2.getData() + " es menor que " + n1.getData());
         * n2 = n2.getRight();
         * }
         * System.out.println(n2.getData() + " es mayor/igual que " + n1.getData());
         * list.first = n1.getRight();
         * aux = n1.getRight();
         * aux2 = n2.getLeft();
         * n2.setLeft(n1);
         * n2.getLeft().setRight(n2);
         * 
         * if (n2 == lista.first) {
         * lista.first = n2.getLeft();
         * } else {
         * aux2.setRight(n1);
         * n1.setLeft(aux2);
         * }
         * n1 = aux;
         * 
         * lista.traversalRight();
         * }
         * // EJERCICIO 2:
         * /*
         * Dadas dos listas DOBLEMENTE ENLAZADAS ORDENADAS ascendentemente ya
         * creadas, PTR1 y PTR2, hacer un algoritmo que elimine de la lista PTR1 los
         * elementos de PTR1 que no estén en PTR2. El resultado de la lista PTR1 debe
         * mostrarse en forma descendente.
         */
        /*
         * System.out.println(" ");
         * System.out.println("----------------*----------------");
         * System.out.println("EJERCICIO 2: ");
         * SimpleDoubleLinkedList PTR1 = new SimpleDoubleLinkedList();
         * PTR1.addQueue(1);
         * PTR1.addQueue(2);
         * PTR1.addQueue(3);
         * PTR1.addQueue(4);
         * PTR1.addQueue(13);
         * SimpleDoubleLinkedList PTR2 = new SimpleDoubleLinkedList();
         * PTR2.addQueue(2);
         * PTR2.addQueue(3);
         * PTR2.addQueue(5);
         * PTR2.addQueue(8);
         * PTR2.addQueue(13);
         * System.out.println("Lista PTR1:");
         * PTR1.traversalRight();
         * System.out.println("Lista PTR2:");
         * PTR2.traversalRight();
         * n1 = PTR1.first;
         * n2 = PTR2.first;
         * 
         * while (n1 != null) {
         * boolean d = true;
         * while (n1.getData() >= n2.getData() & d == true) {
         * if (n1.getData() == n2.getData()) {
         * d = false;
         * } else {
         * n2 = n2.getRight();
         * }
         * }
         * if (d) {
         * int n = n1.getData();
         * System.out.println("se eliminó el: " + n);
         * n1 = n1.getRight();
         * PTR1.delete(n);
         * PTR1.traversalRight();
         * } else {
         * n1 = n1.getRight();
         * }
         * }
         * System.out.println("Resultado descendente: ");
         * PTR1.traversalLeft();
         */

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
        System.out.println(" ");
        System.out.println("----------------*----------------");
        System.out.println("EJERCICIO 3: ");
        SimpleDoubleLinkedList ptr1 = new SimpleDoubleLinkedList();
        ptr1.addQueue(1);
        ptr1.addQueue(2);
        ptr1.addQueue(3);
        ptr1.addQueue(4);
        ptr1.addQueue(13);
        CircularSimpleDoubleLinkedList ptr2 = new CircularSimpleDoubleLinkedList();
        ptr2.addQueue(12);
        ptr2.addQueue(3);
        ptr2.addQueue(15);
        ptr2.addQueue(4);
        ptr2.addQueue(1);
        ptr2.addQueue(16);
        System.out.println("Lista PTR1:");
        ptr1.traversalRight();
        System.out.println("Lista PTR2:");
        ptr2.traversalRight();
        DoubleNode p2 = ptr2.first, p1, aux2 = null, aux = null;
        /*
         * do {
         * if (ptr1.search(p2.getData()) == null) {
         * System.out.println("hay q instertar el: " + p2.getData());
         * p1 = ptr1.first;
         * if (p1 == null) {
         * ptr1.addQueue(p2.getData());
         * } else {
         * while (p1 != null) {
         * // ptr1.traversalRight();
         * if (p1.getData() > p2.getData()) {
         * System.out.println("el " + p2.getData() + " es menor que el " + p1.getData()
         * + "por lo tanto se inserta antes");
         * aux = p1.getLeft();
         * if (p1 == ptr1.first) {
         * ptr1.first = p2;
         * }
         * aux2 = p2.getRight();
         * p1.setLeft(p2);
         * p1.getLeft().setRight(p1);
         * p2.setLeft(aux);
         * if (aux != null) {
         * aux.setRight(p2);
         * }
         * ptr1.traversalRight();
         * }
         * System.out.println("el " + p2.getData() + " es mayor que el " + p1.getData()
         * + "por lo tanto continuamos el recorrido");
         * aux = p1;
         * p1 = p1.getRight();
         * // System.out.println("p1: " + p1.getData());
         * }
         * if (ptr1.search(p2.getData()) == null) {
         * System.out.println("el " + p2.getData() + " es mayor que el " + aux.getData()
         * + "por lo tanto se inserta al final");
         * ptr1.addQueue(p2.getData());
         * aux2 = p2.getRight();
         * System.out.println("aux2: " + aux2.getData());
         * }
         * }
         * p2 = aux2;
         * } else {
         * System.out.println("el " + p2.getData() + " ya existe en la lista PTR1");
         * p2 = p2.getRight();
         * }
         * } while (p2 != ptr2.first);
         * System.out.println("Lista PTR1:");
         * ptr1.traversalRight();
         * System.out.println("Lista PTR2:");
         * ptr2.traversalRight();
         * 
         * 
         * /*
         * Los elementos que son comunes en las dos listas se deben eliminar de
         * ambas listas.
         */
        p1 = ptr1.first;
        while (p1 != null) {
            if (ptr2.search(p1.getData()) != null) {
                aux = p1.getRight();
                System.out.println("se eliminó el: " + p1.getData());
                ptr1.delete(p1.getData());
                ptr2.delete(p1.getData());
                ptr1.traversalRight();
                ptr2.traversalRight();

                p1 = aux;
            } else {
                p1 = p1.getRight();
            }
        }
    }
}
