package tp2_listes;

public class Node {
	
    private int element;
    private Node next;

    /** Cree un noeud avec l’element et le noeud suivant donnes */
    public Node(int s, Node n) {
        element = s;
        next = n;
    }

    /** Retourne l’element de ce noeud */
    public int getElement() { return element; }

    /** Retourne le noeud suivant de ce noeud */
    public Node getNext() { return next; }

    /** Modifie l’element de ce noeud */
    public void setElement(int newElem) { element = newElem; }

    /** Modifie le noeud suivant de ce noeud */
    public void setNext(Node newNext) { next = newNext; }
    
    
   
}
