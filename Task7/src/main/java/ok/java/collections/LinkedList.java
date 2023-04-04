package ok.java.collections;

public class LinkedList {
    private Node root;

    public LinkedList() {
    }

    public void add(Object item) {
        Node newNode = new Node(item);
        Node lastNode = findLast();

        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }

    private Node findLast() {
        Node last = root;

        if (last != null) {
            while (last.getNext() != null) {
                last = last.getNext();
            }
        }
        return last;
    }

    public Object get(int index) {
        Node last = root;

        while (last.getNext() != null && index > 1) {
            last = last.getNext();
            index--;
        }

        if (index != 1) {
            return "Ошибка";
        } else {
            return last.getValue();
        }
    }

    public int size() {
        Node last = root;
        int index = 0;

        while (last != null) {
            last = last.getNext();
            index++;
        }
        return index;
    }
}



class Node {
    private Object value;
    private Node next;

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}