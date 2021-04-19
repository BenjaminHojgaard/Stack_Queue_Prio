import java.lang.reflect.Array;
import java.util.ArrayList;

public class StackImpl implements Stack<Integer>{
    int next = 0;
    int [] numbers;

    public StackImpl(int size) {
        numbers = new int[size];
    }

    public void push(Integer item) {
        numbers[next] = item;
        next++;
    }

    public Integer pop() {
        Integer returnInteger = numbers[next-1];
        next--;
        return returnInteger;
    }

    public Integer peek() {
        return numbers[next-1];
    }

    public boolean isEmpty() {
        return next == 0;
    }
}
