package tp2_listes;

/** Liste simplement chainee */
public class SLinkedList {
    private Node head; // Tête de la liste
    private int size;  // Nombre d'éléments dans la liste

    public SLinkedList() {
        head = null;
        size = 0;
    }
    
    public SLinkedList(Node head) {
        this.head = head;
        size = 0;
    }

    
    // 1. CREATE : Ajouter un élément en tête ou après la tête
    public void add(int element) {
        if (head == null) {
            head = new Node(element, null);  // Créer la tête si elle n'est pas définie
        } else {
            Node currentNode = head;
            // Parcourir jusqu'au dernier nœud
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            // Ajouter un nouveau nœud à la fin de la liste
            currentNode.setNext(new Node(element, null));
        }
        size++;
    }

    
    // Ajouter un élément au début 
    public void addFirst(int element) {
        head = new Node(element, head);
        ++size;
    }

    
    // 2. READ - Afficher la liste de manière récursive
    public void printList(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.println(currentNode.getElement());
        printList(currentNode.getNext());
    }

    
    public void printList() {
        printList(head);
    }

    
    // 3. UPDATE - Modifier l'élément à une position donnée
    public boolean updateElement(int oldValue, int newValue) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement() == oldValue) {
                currentNode.setElement(newValue);
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    // 4. DELETE - Supprimer le premier élément
    public int removeFirst() {
        if (head == null) {
            System.out.println("Liste vide");
        }
        int removedElement = head.getElement();
        head = head.getNext();
        --size;
        return removedElement;
    }

    // Obtenir la taille de la liste
    public int getSize() {
        return size;
    }
    
    
    public Node getHead() {
    	return head;
    }
    
    // Proposer et impl´ementer un algorithme pour trouver l’avant-dernier nœud dans une liste sim-
    // plement chaˆın´ee o`u le dernier ´el´ement est rep´er´e par sa r´ef´erence nulle au suivant.
    public Node findPenultimateNode() {
        if (head == null || head.getNext() == null) {
            return null; // Pas d'avant-dernier si la liste est vide ou ne contient qu'un seul élément
        }

        Node currentNode = head;
        while (currentNode.getNext().getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    
    // Obtenir le dernier élément
    public Node getLastNode() {
        if (head == null) {
            return null;
        }
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    
    
    // D´ecrire, puis impl´ementer un algorithme pour inverser les ´el´ements d’une liste simplement
    // chaˆın´ee, en utilisant seulement une quantit´e constante d’espace suppl´ementaire, et sans utiliser
    // de r´ecursivit´e.
    // Non fonctionnel
    public SLinkedList inverserListe() {
    	SLinkedList listeInversee = new SLinkedList(getLastNode());
    	while (head.getNext() != null) {
    		listeInversee.addFirst(head.getNext().getElement());
    		head = head.getNext();
    	}
    	listeInversee.addFirst(head.getElement());
    	return listeInversee;
    }
    
    
    // D´ecrire en d´etail, puis impl´ementer comment ´echanger 2 nœuds x et y (et pas seulement
    // leurs contenus) dans une liste simplement chaˆın´ee, ´etant donn´ees les r´ef´erences vers x et y, et
    // seulement ces r´ef´erences.
    // Incertain
    public void swapXY(int x, int y) {
    	int x_temp = x; // Copie temporaire de x
    	updateElement(x, y);
    	updateElement(y, x_temp);
    }
    
}

