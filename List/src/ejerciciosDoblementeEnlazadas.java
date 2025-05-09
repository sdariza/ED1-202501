public class ejerciciosDoblementeEnlazadas {
    public static void main(String[] args) {

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
        System.out.println("--------------------------------");
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
        DoubleNode p2 = ptr2.first, p1, aux = null;

        do {
            if (ptr1.search(p2.getData()) == null) {
                aux = p2.getRight();
                if (p2.getData() > ptr1.last.getData()) {
                    ptr1.addQueue(p2.getData());
                } else {
                    p1 = ptr1.first;
                    if (p2.getData() < ptr1.first.getData()) {
                        p1.setLeft(p2);
                        p2.setRight(ptr1.first);
                        ptr1.first.setLeft(p2);
                        p2.setLeft(null);
                    } else {
                        while (p2.getData() > p1.getData()) {
                            p1 = p1.getRight();
                        }
                        p1.getLeft().setRight(p2);
                        p2.setLeft(p1.getLeft());
                        p2.setRight(p1);
                        p1.setLeft(p2);
                    }
                }
                p2 = aux;
            } else {
                p2 = p2.getRight();
            }
        } while (p2 != ptr2.first);
        System.out.println("Lista PTR1:");
        ptr1.traversalRight();
        // System.out.println("Lista PTR2:");
        // Hay que tener en cuenta que los nodos de la lista circular se insertaron en
        // la otra lista, por lo tanto la lista se rompió.
        // ptr2.traversalRight();

        /*
         * Los elementos que son comunes en las dos listas se deben eliminar de
         * ambas listas.
         */
        System.out.println("------SEGUNDA PARTE: ");
        SimpleDoubleLinkedList ptr11 = new SimpleDoubleLinkedList();
        ptr11.addQueue(1);
        ptr11.addQueue(2);
        ptr11.addQueue(3);
        ptr11.addQueue(4);
        ptr11.addQueue(13);
        CircularSimpleDoubleLinkedList ptr22 = new CircularSimpleDoubleLinkedList();
        ptr22.addQueue(12);
        ptr22.addQueue(3);
        ptr22.addQueue(15);
        ptr22.addQueue(4);
        ptr22.addQueue(1);
        ptr22.addQueue(16);
        p1 = ptr11.first;
        while (p1 != null) {
            if (ptr22.search(p1.getData()) != null) {
                aux = p1.getRight();
                ptr11.delete(p1.getData());
                ptr22.delete(p1.getData());
                p1 = aux;
            } else {
                p1 = p1.getRight();
            }
        }
        System.out.println("RESULTADOS: ");
        System.out.println("Lista PTR1:");
        ptr11.traversalRight();
        System.out.println("Lista PTR2:");
        ptr22.traversalRight();

        System.out.println("--------------TERCERA PARTE: ");
        DoubleNode p = ptr22.first, t;

        while (ptr22.first != null) {
            t = p.getRight();
            ptr22.delete(p.getData());
            ptr22.traversalRight();
            p = t;
        }
        System.out.println("Lista PTR2 destruida:");
        ptr22.traversalRight();
    }
}
