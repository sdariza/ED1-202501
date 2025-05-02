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
        System.out.println("Lista 1");
        list1.traversal();
        System.out.println("El tamaño de la lista es: " + list1.size());
        System.out.println((list1.search(0) == null) ? "Elemento no encontrado" : "Elemento encontrado");

        SimpleList list2 = new SimpleList();
        list2.addStack(0);
        list2.addStack(2);
        list2.addStack(3);
        System.out.println("lista 2");
        list2.traversal();

        // Delete
        System.out.println("Eliminado el elemento 2 de la lista 1");
        list1.delete(2);
        System.out.println("Resultado");
        list1.traversal();

        System.out.println("Iniciamos la lista circular simplemente enlazada");
        CircularSimpleList myCircularSimpleList1 = new CircularSimpleList();
        myCircularSimpleList1.addQueue(0);
        myCircularSimpleList1.addQueue(2);
        myCircularSimpleList1.addQueue(3);
        System.out.println("Elementos añadidos:");
        myCircularSimpleList1.traversal();

        // Lista doblemente enlazada SIMPLE
        System.out.println("Lista doblemente enlazada simple");
        SimpleDoubleLinkedList myDoubleLinkedList = new SimpleDoubleLinkedList();
        myDoubleLinkedList.addQueue(10);
        myDoubleLinkedList.addQueue(20);
        myDoubleLinkedList.addQueue(30);
        myDoubleLinkedList.addQueue(40);
        myDoubleLinkedList.addQueue(130);
        myDoubleLinkedList.addQueue(150);
        myDoubleLinkedList.addQueue(1300);
        myDoubleLinkedList.traversalRight();
        myDoubleLinkedList.traversalLeft();
        System.out.println("Eliminamos el 10");
        myDoubleLinkedList.delete(10);
        myDoubleLinkedList.delete(20);
        myDoubleLinkedList.delete(30);
        System.out.println("Lista resultante:");
        myDoubleLinkedList.traversalRight();
    }
}
