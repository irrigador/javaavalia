import java.util.LinkedList;
import java.util.Queue;

class StackWithQueueSimulation {
    private Queue<Integer> queue;

    public StackWithQueueSimulation() {
        queue = new LinkedList<>();
    }

    public void push(int item) {
        queue.add(item);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.poll());
            size--;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

public class q3 {
    public static void main(String[] args) {
        StackWithQueueSimulation stack = new StackWithQueueSimulation();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop()); // Deve imprimir 3
        System.out.println(stack.pop()); // Deve imprimir 2
        System.out.println(stack.pop()); // Deve imprimir 1
            System.out.println(stack.pop()); // Deve imprimir 1

    }
}
