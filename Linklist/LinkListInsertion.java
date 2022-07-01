package TOP10_ARRAY_QUESTION.Stack.Linklist;

public class LinkListInsertion {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
        void main(){
            Node n1= new Node(10);
            Node n2= new Node(20);
            Node n3= new Node(30);
            Node n4= new Node(40);
            Node head= n1;
            head.next= n2;
            n2.next= n3;
            n3.next= null;
        }

    }
    
}
