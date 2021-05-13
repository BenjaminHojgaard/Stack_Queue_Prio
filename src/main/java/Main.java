import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> numbers = new QueueImpl<>();
        numbers.enqueue(7);
        numbers.enqueue(9);
        numbers.enqueue(13);
        System.out.println(numbers.peek());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.dequeue());

        Stack<Integer> stack = new StackImpl(10);
        stack.push(7);
        stack.push(9);
        stack.push(13);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.push(13);
        System.out.println(stack.isEmpty());


        PriorityQueueImpl<Integer> priorityQueue = new PriorityQueueImpl<Integer>();


        priorityQueue.enqueue(5);
        priorityQueue.enqueue(8);
        priorityQueue.enqueue(13);
        priorityQueue.enqueue(9);
        //priorityQueue.enqueue(7);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.dequeue());
        }
    }
}
