package tp2_listes;

// Liste doublement chaînée
public class DLinkedList {
    private NodeD head; // Tête de la liste
    private int size;  // Nombre d'éléments dans la liste

    public DLinkedList() {
        head = null;
        size = 0;
    }

    // CREATE
    public void addFirst(int element) {
        NodeD newNodeD = new NodeD(element, head, null);
        if (head != null) {
            head.setPrev(newNodeD);
        }
        head = newNodeD;
        ++size;
    }

    // READ
    public void printList() {
        NodeD currentNodeD = head;
        while (currentNodeD != null) {
            System.out.print(currentNodeD.getElement() + " ");
            currentNodeD = currentNodeD.getNext();
        }
        System.out.println();
    }

    // UPDATE
    public boolean updateElement(int oldValue, int newValue) {
        NodeD currentNodeD = head;
        while (currentNodeD != null) {
            if (currentNodeD.getElement() == oldValue) {
                currentNodeD.setElement(newValue);
                return true;
            }
            currentNodeD = currentNodeD.getNext();
        }
        return false;
    }


    // DELETE
    public int removeFirst() {
        if (head == null) {
            System.out.println("Liste vide");
            return -1;
        }
        int removedElement = head.getElement();
        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        }
        --size;
        return removedElement;
    }


    // échange
    public void swap(NodeD x, NodeD y) {
        int temp = x.getElement();
        x.setElement(y.getElement());
        y.setElement(temp);
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        // CREATE
        System.out.println("Ajout d'éléments à la liste :");
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printList(); // Affiche : 30 20 10

        // READ
        System.out.println("Lecture de la liste :");
        list.printList(); // Affiche : 30 20 10

        // UPDATE
        System.out.println("Mise à jour d'un élément de la liste :");
        list.updateElement(20, 25);
        list.printList(); // Affiche : 30 25 10

        // DELETE
        System.out.println("Suppression d'un élément de la liste :");
        list.removeFirst();
        list.printList(); // Affiche : 25 10

        // SWAP
        // Récupération des références vers les nœuds à échanger
        NodeD node1 = list.removeFirst();
        NodeD node2 = node1.getNext();

        // Échange des nœuds
        list.swap(node1, node2);

        // Impression de la liste après l'échange
        list.printList(); // Devrait afficher : 20 30 10
    }


}