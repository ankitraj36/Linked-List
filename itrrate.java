public class itrrate {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

        if (tail == null) {
            tail = newnode;
            
        }
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            
        }else{
            tail.next = newnode;
        tail= newnode;
        }
     
    }


    public int indexOf(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }


    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

            
        }
    }

    public static void main(String[] args) {
        itrrate list = new itrrate();
        list.addFirst(1);
        list.addFirst(2);
        list.addlast(5);
        System.out.println("2" + "    " + list.indexOf(2));
        list.display();
    }
}
