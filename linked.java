public class linked {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAthead(int val) {
            Node temp = new Node(val);
            if (head == null) { //empty list 
                head = tail = temp;
            } else {     // non empty list 
                temp.next = head;
                head = temp;
            }
            head = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // public static void revDisplay(Node head) {
        //     if (head == null) return;
        //     revDisplay(head.next);
        //     System.out.print(head.data + " ");
        // }

    //     int size() {
    //         Node temp = head;
    //         int count = 0;

    //         while (temp != null) {
    //             count++;
    //             temp = temp.next;
    //         }
    //         return count;
    //     }
    // }
     void insertAt(int idx, int val){
        Node t = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
            
        }
        t.next = temp.next;
        temp.next  = t;
     }

     // ISS CODE MAI INDEX VALUE PATA CHALEGAA BHAIII..
     int getAT(int idx){
        Node temp = head;
        for (int i = 0; i < idx; i++) {
           temp = temp.next;            
        }
        return temp.data;
    }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.insertAtEnd(9);
        // ll.insertAtEnd(9);
        // ll.insertAtEnd(9);
        // ll.insertAtEnd(33);
        // ll.insertAtEnd(9);
        // ll.insertAtEnd(100);
        // ll.insertAtEnd(1011);

        ll.insertAthead(1);
        ll.insertAthead(10);
        ll.insertAthead(100);

        ll.insertAthead(1001);

        ll.insertAthead(13);
        ll.insertAthead(561);
        ll.insertAthead(81);
    
        ll.insertAthead(553);

        ll.insertAt(2, 69);
        
       // ll.display();
        // System.out.println();
        // System.out.print("Size: " + ll.size());
        // System.out.println("\nReversed Display:");
        // LinkedList.revDisplay(ll.head);
        System.out.println(ll.getAT(1));
    }
}
