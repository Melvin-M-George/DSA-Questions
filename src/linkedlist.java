//Operations on linked list

public class linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Single LinkedList is empty");
        }

        Node current = head;

        while (current != null) {
            System.out.print("->" + current.data);
            current = current.next;
        }
    }

    public int Count() {
        int length = 0;

        if (head == null) {
            return 0;
        }

        Node curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        return length;

    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteNode(int key) {
        Node temp, prev = null;

        temp = head;

        while (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("No value");
            return;
        }

        System.out.println("Deleted " + head.data);

        head = head.next;
    }

    public Node deleteLast() {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node second_last = head;

        while (second_last.next.next != null) {
            second_last = second_last.next;
        }

        second_last.next = null;

        return head;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int currentPosition = 0;
            while (current != null && currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }

            if (current == null) {
                System.out.println("Invalid position. The list has fewer elements.");
                return;
            }

            newNode.next = current.next;
            current.next = newNode; 

            if (current == tail) {
                tail = newNode;
            }
        }
    }

    
    
    public void deleteAtPosition(int position) {
        
        if (position == 1) {
            head = head.next;
            return;
        }
        
        Node temp = head;
        Node prev = null;
        int currPosition = 1;
        
        while (temp != null && currPosition < position) {
            prev = temp;
            temp = temp.next;
            currPosition++;
        }
        
        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }
        
        prev.next = temp.next;
        
    }
    
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;
    }

    public void minMax(Node head) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        Node temp = head;

        while(temp != null) {
            if(temp.data > max) {
                max = temp.data;
            }else if(temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }

        System.out.println();
        System.out.println("The maximum is " + max);
        System.out.println("The minimum is " + min);
    }

    public void findIndex(int a) {
        Node temp = head;
        int index = 1;
        boolean found = false;

        while(temp != null) {
            if(a ==  temp.data) {
                System.out.println("The index is " + index);
                found = true;
                break;
            }
            ++index;
            temp = temp.next;
        }

        if(!found) {
            System.out.println("The number is not present in the linkedlist");
        }
        
    }
    
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addNode(632);
        list.addNode(325);
        list.addNode(243);
        list.addNode(423);
        // list.insertFirst(953);
        // list.insertFirst(745);
        // list.deleteNode(745);
        // list.insertAtPosition(199, 2);
        // list.deleteLast();
        list.display();
        list.minMax(list.head);
        list.findIndex(325);
        // System.out.println();
        // list.deleteAtPosition(2);
        // list.display();
        // System.out.println();
        // System.out.println(list.Count());

        // App list2 = new App();
        // list2.addNode(32);
        // list2.addNode(34);
        // list2.addNode(85);
        // list2.addNode(43);
        // list2.addNode(95);

    }
}