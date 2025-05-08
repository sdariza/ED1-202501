public class ejerciciosDoblementeEnlazadas {
    public static void main(String[] args) {
        // creación de lista #1

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
        DoubleNode p2 = ptr2.first, p1, aux = null, aux2 = null;

        do {
            if (ptr1.search(p2.getData()) == null) {
                System.out.println("hay q instertar el: " + p2.getData());
                p1 = ptr1.first;
                if (p1 == null) {
                    ptr1.addQueue(p2.getData());
                } else {
                    while (p1 != null) {
                        // ptr1.traversalRight();
                        if (p1.getData() > p2.getData()) {
                            System.out.println("el " + p2.getData() + " es menor que el " + p1.getData()
                                    + "por lo tanto se inserta antes");
                            aux = p1.getLeft();
                            if (p1 == ptr1.first) {
                                ptr1.first = p2;
                            }
                            aux2 = p2.getRight();
                            p1.setLeft(p2);
                            p1.getLeft().setRight(p1);
                            p2.setLeft(aux);
                            if (aux != null) {
                                aux.setRight(p2);
                            }
                            ptr1.traversalRight();
                        }
                        System.out.println("el " + p2.getData() + " es mayor que el " + p1.getData()
                                + "por lo tanto continuamos el recorrido");
                        aux = p1;
                        p1 = p1.getRight();
                        // System.out.println("p1: " + p1.getData());
                    }
                    if (ptr1.search(p2.getData()) == null) {
                        System.out.println("el " + p2.getData() + " es mayor que el " + aux.getData()
                                + "por lo tanto se inserta al final");
                        ptr1.addQueue(p2.getData());
                        aux2 = p2.getRight();
                        System.out.println("aux2: " + aux2.getData());
                    }
                }
                p2 = aux2;
            } else {
                System.out.println("el " + p2.getData() + " ya existe en la lista PTR1");
                p2 = p2.getRight();
            }
        } while (p2 != ptr2.first);
        System.out.println("Lista PTR1:");
        ptr1.traversalRight();
        System.out.println("Lista PTR2:");
        ptr2.traversalRight();

        /*
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
