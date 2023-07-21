import java.util.LinkedList;
import java.util.Queue;

class StackWithQueues {
    private Queue<Integer> queue1; // Fila para adicionar elementos
    private Queue<Integer> queue2; // Fila auxiliar para manipulação

    public StackWithQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int item) {
        queue2.add(item);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        // Trocar as referências das filas, garantindo que o elemento mais recente fique no topo
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return queue1.poll();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public int size() {
        return queue1.size();
    }
}

public class q2 {
    public static void main(String[] args) {
        QueueWithStacks queue = new QueueWithStacks();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue()); // Deve imprimir 1
        System.out.println(queue.dequeue()); // Deve imprimir 2
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue());// Deve imprimir 3
    }
}
