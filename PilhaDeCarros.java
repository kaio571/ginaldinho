import java.util.Stack;

public class PilhaDeCarros {
    private Stack<String> carros;

    public PilhaDeCarros() {
        carros = new Stack<>();
    }

 
    public void adicionarCarro(String carro) {
        carros.push(carro);
    }

  
    public String removerCarro() {
        return carros.pop();
    }


    public String verTopoCarro() {
        return carros.peek();
    }

    public boolean estaVazia() {
        return carros.empty();
    }

    public static void main(String[] args) {
        PilhaDeCarros pilha = new PilhaDeCarros();

        pilha.adicionarCarro("Carro 1");
        pilha.adicionarCarro("Carro 2");
        pilha.adicionarCarro("Carro 3");

        System.out.println("Topo da pilha: " + pilha.verTopoCarro());

        while (!pilha.estaVazia()) {
            System.out.println("Removendo carro do topo: " + pilha.removerCarro());
        }

        System.out.println("A pilha está vazia? " + pilha.estaVazia());
    }
}
