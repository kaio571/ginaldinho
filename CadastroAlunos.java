import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    String nome;
    int matricula;
    String dataNascimento;

    public Aluno(String nome, int matricula, String dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
}

public class CadastroAlunos {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar todos os alunos");
            System.out.println("3. Pesquisar aluno");
            System.out.println("4. Remover aluno");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite a data de nascimento do aluno (DD/MM/AAAA): ");
                    String dataNascimento = scanner.nextLine();
                    listaAlunos.add(new Aluno(nome, matricula, dataNascimento));
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno aluno : listaAlunos) {
                            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula + ", Data de Nascimento: " + aluno.dataNascimento);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome ou matrícula do aluno a ser pesquisado: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Aluno aluno : listaAlunos) {
                        if (aluno.nome.equalsIgnoreCase(busca) || String.valueOf(aluno.matricula).equals(busca)) {
                            System.out.println("Aluno encontrado:");
                            System.out.println("Nome: " + aluno.nome + ", Matrícula: " + aluno.matricula + ", Data de Nascimento: " + aluno.dataNascimento);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome ou matrícula do aluno a ser removido: ");
                    String remocao = scanner.nextLine();
                    boolean removido = false;
                    for (Aluno aluno : listaAlunos) {
                        if (aluno.nome.equalsIgnoreCase(remocao) || String.valueOf(aluno.matricula).equals(remocao)) {
                            listaAlunos.remove(aluno);
                            System.out.println("Aluno removido com sucesso!");
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}
