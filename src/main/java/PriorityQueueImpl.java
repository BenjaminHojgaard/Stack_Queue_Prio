public class PriorityQueueImpl<T extends Comparable<T>> implements Queue<T> {
    Node<T> top = null;


    public void enqueue(T item) {
        Node<T> node = new Node<T>(item, null);
        if (top == null) {
            top = node;
            return;
        }

        boolean isPlaced = false;
        var temp = top;
        while (!isPlaced) {
            if(node.value.compareTo(temp.value) > 0) {
                if (temp.value.compareTo(top.value) > 0) {

                }

                top = node;
                top.next = temp;
                isPlaced = true;



//                var oldTemp = temp;
//                temp = node;
//                temp.next = oldTemp;
//                isPlaced = true;
            } else {
                if (temp.next == null) {
                    temp.next = node;
                    isPlaced = true;
                } else {
                    temp = temp.next;
                }
            }
        }







//        if (top.value.compareTo(node.value) < 0) {
//            var oldTop = top;
//            top = node;
//            top.next = oldTop;
//            return;
//        }
//
//        var temp = top;
//        while(temp.next != null) {
//            if (temp.value.compareTo(node.value) > 0 && temp.next.value.compareTo(node.value) < 0 ){
//                var tempNext = temp.next;
//                temp.next = node;
//                node.next = tempNext;
//                break;
//            } else {
//                temp = temp.next;
//            }
//        }
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
