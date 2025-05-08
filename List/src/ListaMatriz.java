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

}
