public class ejerciciosCircularSimple {
    public static void main(String[] args) {
        // creación de lista #1
        CircularSimpleList circularList = new CircularSimpleList();
        circularList.addQueue(1);
        circularList.addQueue(1);
        circularList.addQueue(1);
        circularList.addQueue(2);
        circularList.addQueue(1);
        circularList.addQueue(5);
        circularList.addQueue(6);
        circularList.addQueue(6);
        circularList.addQueue(2);
        circularList.addQueue(2);
        circularList.addQueue(8);
        circularList.addQueue(9);
        circularList.addQueue(2);
        circularList.addQueue(1);
        circularList.addQueue(4);
        circularList.addQueue(4);
        circularList.addQueue(1);

        circularList.traversal();

        // creación de lista #2
        CircularSimpleList circularlist2 = new CircularSimpleList();
        circularlist2.addQueue(5);
        circularlist2.addQueue(20);
        circularlist2.addQueue(35);
        circularlist2.addQueue(48);
        circularlist2.addQueue(100);
        // circularlist2.traversal();

        // EJERCICIO 1:
        /*
         * Dada Una lista enlazada CIRCULAR ya creada. Hacer un algoritmo para eliminar
         * aquellos elementos que aparezcan repetidos secuencialmente sin dejar ningún
         * elemento de ellos. Este proceso debe hacerse hasta que ya no queden
         * secuencias repetidas (esto quiere decir que la lista se puede recorrer varias
         * veces). Además, se requiere llevar un contador de cuantos elementos en total
         * fueron eliminados. Ejemplo:
         * PTR = < 1,1,1,2,1,5,6,6,2,2,8,9,2,1,4,4,1 >
         * En el primer recorrido la lista quedaría
         * PTR = < 2,1,5,8,9,2,1,1>
         * Si observamos aún quedan secuencias de elementos repetidos debemos volver
         * a eliminarlos: PTR = < 2,1,5,8,9,>
         */

        Node p = circularList.first;
        int c = 0;
        while (p.next != circularList.first) {
            while (p.data == p.next.data) {
                Node aux2 = null, aux = p;
                while (aux.data == p.data) {
                    c += 1;
                    aux2 = aux.next;
                    System.out.println("Se eliminará el elemento: " + aux.data);
                    circularList.delete(aux.data);
                    aux = aux2;
                    System.out.println("pagame mi plata que es 5" + aux.data);
                    circularList.traversal();
                }
                p = aux;
            }
            p = p.next;
        }
    }
}
