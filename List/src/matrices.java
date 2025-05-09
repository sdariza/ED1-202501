public class matrices {
    public static void main(String[] args) {
        System.out.println("hola wilmar");
        ListaMatriz lista = new ListaMatriz();
        lista.add(0, 0, 1);
        lista.add(0, 1, 2);
        lista.add(1, 1, 3);
        lista.add(2, 2, 4);

        // EN EL CASO DEL EJEMPLO DEL ENUNCIADO DEL PARCIAL LA MATRIZ ES DE
        // 3 FILAS Y 3 COLUMNAS Y N=3
        int n = 3;
        int m = 3;
        SimpleList columnas, filas, matriz;
        columnas = new SimpleList();
        filas = new SimpleList();
        matriz = new SimpleList();

        nodoMatriz nd = lista.first;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (nd.fila != i | nd.columna != j) {
                    System.out.println("agregado un " + 0);
                    filas.addQueue(0);

                } else {
                    System.out.println("agregado un " + nd.valor);

                    filas.addQueue(nd.valor);
                    nd = nd.siguiente;
                }
            }
        }
        nd = lista.first;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nd.columna != i | nd.fila != j) {
                    columnas.addQueue(0);
                } else {
                    columnas.addQueue(nd.valor);
                    nd = nd.siguiente;
                }
            }
        }
        filas.traversal();
        columnas.traversal();

        matriz = filas;
        for (int i = 0; i < n - 1; i++) {
            matriz = elevar(matriz, columnas, m);
        }
        matriz.traversal();
        nodoMatriz q = lista.first;
        Node h = matriz.first;
        while (h != null) {
            if (h.data != 0) {
                q.valor = h.data;
                q = q.siguiente;
            }
            h = h.next;
        }
        lista.traversal();
    }

    public static SimpleList elevar(SimpleList listfilas, SimpleList listcolumnas, int m) {
        SimpleList matriz = new SimpleList();
        Node f = null, af = listfilas.first;
        Node c = listcolumnas.first;
        int k = 0, sum;
        for (int l = 0; l < m; l++) {
            for (int i = 0; i < m; i++) {
                sum = 0;
                f = af;
                for (int j = 0; j < m; j++) {
                    k = f.data * c.data;
                    sum += k;
                    f = f.next;
                    c = c.next;
                }
                matriz.addQueue(sum);
            }
            sum = 0;
            af = f;
            c = listcolumnas.first;
        }
        return matriz;
    }
}