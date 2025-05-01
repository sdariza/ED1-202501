public class App {
    public static void main(String[] args) throws Exception {
        // Creación de nodos sin conexión
        /*Node first = new Node(5);
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
        System.out.println("El tamaño de la lista es: "+list1.size());
        System.out.println((list1.search(0) == null) ? "Elemento no encontrado" : "Elemento encontrado");

        SimpleList list2 = new SimpleList();
        list2.addStack(0);
        list2.addStack(2);
        list2.addStack(3);
        System.out.println("lista 2");
        list2.traversal();

        //Delete
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
        myCircularSimpleList1.traversal();*/

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
        /*myDoubleLinkedList.traversalLeft();
        System.out.println("Eliminamos el 10");
        myDoubleLinkedList.delete(10);
        myDoubleLinkedList.delete(20);
        myDoubleLinkedList.delete(30);
        System.out.println("Lista resultante:");
        myDoubleLinkedList.traversalRight();*/
        SimpleDoubleLinkedList doublelinked2 = new SimpleDoubleLinkedList();
        doublelinked2.addQueue(5);
        doublelinked2.addQueue(20);
        doublelinked2.addQueue(35);
        doublelinked2.addQueue(48);
        doublelinked2.addQueue(100);
        doublelinked2.traversalRight();

        //ejercicio 1:
        SimpleDoubleLinkedList lista,list;
        if(myDoubleLinkedList.size()>doublelinked2.size()){
        lista = myDoubleLinkedList;
             list = doublelinked2;
        }else{
            lista = doublelinked2;
            list = myDoubleLinkedList;
        }
        
        System.out.println("la lista más larga es: ");
        lista.traversalRight();
        System.out.println("la más corta es: ");
        list.traversalRight();

        DoubleNode n1,n2,aux=null,aux2;
        n1=list.first;
        n2=lista.first;
        
        
        for (int i=0;i<list.size();){
            System.out.println("n1: "+n1.getData());
            System.out.println("n2: "+n2.getData());
            
            while(n2.getData()<n1.getData()){
                System.out.println(n2.getData()+" es menor que "+n1.getData());
                n2=n2.getRight();
            }
            System.out.println(n2.getData()+" es mayor/igual que "+n1.getData());
            if(n1==list.first){
                list.first=n1.getRight();
            }
            aux=n1.getRight();
            aux2=n2.getLeft();
            n2.setLeft(n1);
            n2.getLeft().setRight(n2);

            if(n2==lista.first){
                lista.first=n2.getLeft();
            }else{
                aux2.setRight(n1);
                n1.setLeft(aux2);
            }
            n1=aux;       
            
        lista.traversalRight();  
        }
    }
}
