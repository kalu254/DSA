package core_dsa.linked_list;

public class CommonLinkedListProblems {

    //count number of nodes in a linked list

    Node head;

    private int numberOfNodes() {
        int count = 0;
        if (head == null) {
            count = 0;
        } else {
            Node current = head;
            while (current != null){
                current = current.getNext();
                count++;
            }
        }

        return count;
    }

    /*
    Add a new NODE
     */

    private void addNewNode(Node newNode){

        //traverse

        if (head == null){
            head = newNode;
        }else
        {

            Node current = head;

            while (current != null)
            {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

    }

    /*
    Pop top element, the first
    You point the current head to be the next node
     */

    public Node popTopElement(){
        if (head != null){
            Node topElement = head;
            head = head.getNext();
            return topElement;
        }

        return null;
    }

}
