public class LinkedList <T>{
    class Node{
        T data;
        Node next;
        Node(T x){
            data = x;
            next = null;
        }
    }
    Node head;
    LinkedList(){
        head = null;
    }
    void display(){
        Node temp=null;
        for(temp = head;temp != null;temp = temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
    void addStart(T x){
        if(head == null){
            head = new Node(x);
            return;
        }
        Node nn = new Node(x);
        nn.next = head;
        head = nn;
        return;
    }
    void addEnd(T x){
        if(head == null){
            head = new Node(x);
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new Node(x);
    }
    void addPos(T x,int pos){
        if(pos == 0){
            this.addStart(x);
            return;
        }
        int k=0;
        Node prev = null,curr=head;
        while(curr.next != null){
            if(k==pos)  break;
            prev = curr;
            curr = curr.next;
            k++;
        }
        Node nn = new Node(x);
        prev.next = nn;
        nn.next = curr;
        return;
    }
    void delStart(){
        if(head == null){
            System.out.println("Underflow.");
            return;
        }
        head = head.next;
        return;
    }
    void delLast(){
        if(head == null){
            System.out.println("Underflow.");
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node last = head;
        while(last.next.next != null){
            last = last.next;
        }
        last.next = null;
    }
    void delPos(int pos){
        if(pos == 0){
            this.delStart();;
            return;
        }
        int k=0;
        Node prev = null,curr= head;
        while(curr != null){
            if(k==pos)  break;
            prev = curr;
            curr = curr.next;
            k++;
        }
        prev.next = curr.next;
    }
    void reverse(){
        if(head == null){
            return ;
        }
        Node curr=head,prev,ahead;
        prev = ahead = null;
        while(curr != null){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        head = prev;
        return;
    }
}
