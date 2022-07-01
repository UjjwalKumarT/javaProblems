package TOP10_ARRAY_QUESTION.Stack.Linklist;

public class Middle {
    
    
    

Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
}
// Node creation
void createNode( int data){
Node n1= new Node(10);
Node n2= new Node(20);
Node n3= new Node(30);
Node n4= new Node(40);
Node n5= new Node(50);

Node head = n1;
head.next=n2;
n2.next= n3;
n3.next= n4;
n4.next= n5;
n5.next= null;
}
// length cal
public static int getLen(){
int length=0;
Node temp = head;
while(temp!= null){
    length++;
    temp= temp.next;
}
return length;
}
//printing middle
static void printMiddle(){
if(head != null){
    int length = getLen();
    Node temp = head;
    int middleLength = length/2;
    while(middleLength != 0){
        temp= temp.next;
        middleLength--;
    }
    System.out.println(temp.data);
}
}





public static void main(String args[]) {
printMiddle();
}
}
    
}
