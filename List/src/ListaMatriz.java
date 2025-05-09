public class ListaMatriz {
    nodoMatriz first;
    nodoMatriz last;

    ListaMatriz() {

    }

    public void add(int fila, int columna, int valor) {
        nodoMatriz newNode = new nodoMatriz(fila, columna, valor);
        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.siguiente = newNode;
            last = newNode;
        }

    }

    public void traversal() {
        nodoMatriz nd = first;
        while (nd != null) {
            System.out.print("( " + nd.fila + ", " + nd.columna + ", " + nd.valor + " ) -> ");
            nd = nd.siguiente;
        }
        System.out.println("NULL");
    }
}
