public class Stack {

    int tope = -1, tam, pila[];

    Stack(int tam) {
        this.pila = new int[tam];
        this.tam = tam;
    }

    void addStack(int elem) {
        if (tope < tam - 1) {
            tope++;
            pila[tope] = elem;
            System.out.println("Elemento añadido >.<");
        } else {
            System.out.println("No hay espacios, busque en otro lado. 😒");
        }
    }

    String pop() {
        if (tope != -1) {
            return "" + pila[tope--];
        }
        return null;
    }

    void traversal() {
        System.out.println("Elementos en la pila:");
        for (int i = tope; i > -1; i--) {
            System.out.print(pila[i] + "|");
        }
        System.out.println();
    }

}
