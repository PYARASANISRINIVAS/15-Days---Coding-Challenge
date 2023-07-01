

class SingleLinkedList{
    public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    Node head;
    public void add(int x){
        Node node=new Node(x);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;

        }
        return;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return;
    }
    public int length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void reverse(){
        Node first=null;
        while(head!=null){
           Node second=head.next;
           head.next=first;
           first=head;
           head=second;

        }
        head=first;
        
    }
    public void printRev(Node head){
        if(head==null)
            return;
        printRev(head.next);
        System.out.print(head.data+" ");
    }
    public void insert(int x,int pos){
        Node node=new Node(x);
        Node temp=head;
        if(pos==0){
            node.next=head;
            head=node;
        }
        else if(pos>this.length()|| pos<0){
            return;
        }
        else{
            while(pos-->1){
          temp=temp.next;  
            }
        node.next=temp.next;
        temp.next=node;

        }
        
        

    }

}

    
public class LinkedList {
    public static void main(String[] args){     
        SingleLinkedList list=new SingleLinkedList();
        SingleLinkedList list2=new SingleLinkedList();
        list.add(3);
        list2.add(4);
        list2.add(5);
        list2.print();
        // System.out.println(list2.length());
        // list2.reverse();
        // list2.print();
        System.out.println();
        // list2.printRev(list2.head);
        // list2.reverse();
        list2.insert(10,2);
         list2.print();

    }
}
