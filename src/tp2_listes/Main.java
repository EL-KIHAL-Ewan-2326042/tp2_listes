package tp2_listes;
public class Main {
    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();

        // CREATE : Ajouter des éléments à la liste
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        // READ : Afficher la liste
        System.out.println("Liste actuelle :");
        list.printList(); // Doit afficher 30 -> 20 -> 10

        // UPDATE : Modifier un élément
        System.out.println("Modification de l'élément 20 à 25 :");
        list.updateElement(20, 25);
        list.printList(); // Doit afficher 30 -> 25 -> 10

        // DELETE : Supprimer le premier élément
        System.out.println("Suppression du premier élément : " + list.removeFirst());
        list.printList(); // Doit afficher 25 -> 10

        // Taille de la liste
        System.out.println("Taille actuelle de la liste : " + list.getSize());
        
        list.addFirst(50);
        list.addFirst(8);
        
        System.out.println("Taille actuelle de la liste : " + list.getSize());
        
        // Afficher la liste non inversée
        System.out.print("La liste non inversée est ");
        list.printList();
        
        // avant dernier noeud
        Node penultimateNode = list.findPenultimateNode();
        if (penultimateNode != null) {
            System.out.println("L'avant-dernier élément est : " + penultimateNode.getElement());
        }
          
        // dernier noeud
        System.out.println("Le dernier noeud est " + list.getLastNode().getElement());
        
        // Liste inversée
        SLinkedList listeInversee = list.inverserListe();
        System.out.print("La liste inversée est ");
        listeInversee.printList();
        
        System.out.println("---------------------");
        
        // Swap
        list.swapXY(10, 8);
        System.out.print("La liste échangée est ");
        list.printList();
        
    }
}
