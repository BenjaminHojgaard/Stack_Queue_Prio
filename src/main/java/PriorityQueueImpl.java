public class PriorityQueueImpl<T extends Comparable<T>> implements Queue<T> {
    Node<T> top = null;
    Node<T> bottom = null;


    public void enqueue(T item) {
        Node<T> node = new Node<T>(item, null);
        if (bottom == null) {
            top = bottom = node;
        }

        if (top.value.compareTo(node.value) < 0) {
            var oldTop = top;
            top = node;
            top.next = oldTop;
            return;
        }

        var temp = top;
        while(temp.next != null) {
            if (temp.value.compareTo(node.value) > 0 && temp.next.value.compareTo(node.value) < 0 ){
                var tempNext = temp.next;
                temp.next = node;
                node.next = tempNext;
                break;
            } else {
                temp = temp.next;
            }
        }
    }

    public T dequeue() {
        var currentTop = top;
        top = top.next;
        return currentTop.value;
    }

    public T peek() {
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }


}
