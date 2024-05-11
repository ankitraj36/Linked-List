public class Linkeist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        } else {
            int val = head.data;
            size--;
            head = head.next;
            return val;
        }
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        } else {
            Node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }
            int val = tail.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkeist list = new Linkeist();
        list.addFirst(3);
        list.addFirst(32);
        list.addFirst(22);
        list.addLast(21333);

        list.display();
        System.out.println("Index of 32: " + list.indexOf(32));
    }
}
