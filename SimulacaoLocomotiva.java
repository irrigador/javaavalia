    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Stack;

    public class SimulacaoLocomotiva {

        public static void main(String[] args) {
            // Simulando os vagões da locomotiva
            int[] vagoes = {1, 2, 3, 4, 5};

            // Fila para simular a entrada dos vagões na linha auxiliar
            Queue<Integer> filaAuxiliar = new LinkedList<>();
            for (int v : vagoes) {
                filaAuxiliar.add(v);
            }

            // Pilha para simular a mudança de rota (os vagões saem da linha auxiliar nesta ordem)
            Stack<Integer> pilhaMudancaDeRota = new Stack<>();
            while (!filaAuxiliar.isEmpty()) {
                pilhaMudancaDeRota.push(filaAuxiliar.poll());
            }

            // Imprimindo a ordem de saída dos vagões para o sentido desejado (sul)
            System.out.println("Ordem de saída dos vagões para o sentido sul:");
            while (!pilhaMudancaDeRota.isEmpty()) {
                System.out.println("Vagão " + pilhaMudancaDeRota.pop());
            }
        }
    }
