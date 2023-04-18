package E2;
import java.util.ArrayList;

public class GenericStack<T> {

    private ArrayList<T> stack;
    private int size;

//Constructor
    public GenericStack() {
        this.stack = new ArrayList<T>();
    }

//Methods
    public int size() {
        return stack.size();
    }

    public T peek() {
        if (stack.isEmpty()) {
            return null;
        }
        else {
            return stack.get(stack.size() - 1);
        }
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        else {
            T extract = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return extract;
        }
    }

    public void push(T element) {
        stack.add(element);
    }

    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
