public class QueueImpl<T extends Comparable<T>> implements Queue<T>{

    Node<T> top = null;
    Node<T> bottom = null;

//    private static class Node<T> {
//        T value;
//        Node<T> next;
//
//        public Node(T value, Node<T> next) {
//            this.value = value;
//            this.next = next;
//        }
//    }

    public void enqueue(T item) {
        Node<T> node = new Node<T>(item, null);
        if (bottom == null) {
            top = bottom = node;
        }
        bottom.next = node;
        bottom = bottom.next;
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
