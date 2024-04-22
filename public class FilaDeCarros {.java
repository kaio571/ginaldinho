public class FilaDeCarros {
    private Queue<String> carros;
    public FilaDeCarros() {
        carros = new LinkedList<>();
    }
    public void adicionarCarro(String carro) {
        carros.add(carro);
    }
    public String removerCarro() {
        return carros.poll();
    }
    public String verProximoCarro() {
        return carros.peek();
    }
    public boolean estaVazia() {
        return carros.isEmpty();
    }
    public static void main(String[] args) {
        FilaDeCarros fila = new FilaDeCarros();
        fila.adicionarCarro("");
        fila.adicionarCarro("Carro 2");
        fila.adicionarCarro("Carro 3");
        System.out.println("Próximo carro na fila: " + fila.verProximoCarro());
        while (!fila.estaVazia()) {
            System.out.println("Removendo carro: " + fila.removerCarro());
        }
        System.out.println("A fila está vazia? " + fila.estaVazia());
    }
}