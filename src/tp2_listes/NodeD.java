package tp2_listes;

public class NodeD {
    private int element;
    private NodeD next;
    private NodeD prev;

    public NodeD(int element, NodeD next, NodeD prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getPrev() {
        return prev;
    }

    public void setPrev(NodeD prev) {
        this.prev = prev;
    }
}