package TOP10_ARRAY_QUESTION.Stack.Linklist;

public class InsertionAtMiddle {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
   /*  void main(){
        traverse (head);
    }
    void traverse(Node head){
        Node curr=head;
        while(curr !=null){
            print(curr data);
            curr=curr.next;
        }
    }
*/
    void main(){
        insert (30,head,3);
    }    
    void insert(int data, Node head, int pos){
        Node toAdd = new Node(data);
        if(pos ==0){
            toAdd.next= head;
            head= toAdd; return;
        }
        Node prev = head;
        for(int i=0; i<pos-1; i++){
            prev= prev.next;
        }
        toAdd.next = prev.next;
        prev.next= toAdd;
    }
}

