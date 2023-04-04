package ok.java.collections;

public class LinkedListT<T> {
    private NodeT root;

    public LinkedListT() {
    }

    public void add(T item) {
        NodeT<T> newNode = new NodeT(item);
        NodeT lastNode = findLast();

        if (lastNode == null) {
            root = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }

    private NodeT<T> findLast() {
        NodeT last = root;

        if (last != null) {
            while (last.getNext() != null) {
                last = last.getNext();
            }
        }
        return last;
    }

    public T get(int index) {
        NodeT<T> last = root;

        while (last.getNext() != null && index > 1) {
            last = last.getNext();
            index--;
        }

        if (index != 1) {
            return null;
        } else {
            return (T) last.getValue();
        }
    }

    public int size() {
        NodeT<T> last = root;
        int index = 0;

        while (last != null) {
            last = last.getNext();
            index++;
        }
        return index;
    }
}


class NodeT<T> {
    private T value;
    private NodeT next;

    public NodeT(T value) {
        this.value = value;
        this.next = null;
    }

    public NodeT(T value, NodeT next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeT getNext() {
        return next;
    }

    public void setNext(NodeT next) {
        this.next = next;
    }
}