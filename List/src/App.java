public class App {
    public static void main(String[] args) throws Exception {
        // Creación de nodos sin conexión
        Node first = new Node(5);
        System.out.println(first.data + " el siguiente es: " + first.next);

        Node segundo = new Node(0);
        System.out.println(segundo.data + " el siguiente es: " + segundo.next);

        Node tercero = new Node(1);
        System.out.println(tercero.data + " el siguiente es: " + tercero.next);

        first.next = segundo;
        segundo.next = tercero;
        System.out.println(first.data + " el siguiente es: " + first.next.data);
        System.out.println(segundo.data + " el siguiente es: " + segundo.next.data);
        System.out.println(tercero.data + " el siguiente es: " + tercero.next);

        SimpleList list1 = new SimpleList();
        list1.addQueue(0);
        list1.addQueue(2);
        list1.addQueue(3);
        list1.traversal();

        System.out.println((list1.search(0) == null) ? "Elemento no encontrado" : "Elemento encontrado");

        SimpleList list2 = new SimpleList();
        list2.addStack(0);
        list2.addStack(2);
        list2.addStack(3);
        list2.traversal();

    }
}
