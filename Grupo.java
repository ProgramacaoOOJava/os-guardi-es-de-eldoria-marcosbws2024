

//Desafio Mestre
//Declaracao de Bibliotecas
import java.util.*;

public class Grupo {
    // Declarando Variaveis
    private String nomeGrupo;
    private List<Personagem> membros;

    // Construtor do Grupo
    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.membros = new ArrayList<>();
    }

    // Metodo para pegar no do Grupo
    public String getNomeGrupo() {
        return nomeGrupo;
    }

    // metodo para adicionar Personagens ao Grupo
    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
    }

    // Listar Membros do Grupo
    public void listarMembros() {
        System.out.println("Membros do grupo " + nomeGrupo + ":\n");
        for (Personagem membro : membros) {
            System.out.println("- " + membro.nome + " (" + membro.classe + ")\n");
        }
    }

    // metodo para criar as batalhas
    public void batalhar(Personagem personagem1, Personagem personagem2) {
        // Calculando o poder total usando o método polimórfico
        double poderTotalPersonagem1 = personagem1.calcularPoderTotal();
        double poderTotalPersonagem2 = personagem2.calcularPoderTotal();

        // Escrevendo que são os personagem da Batalha e seus Atributos
        System.out.println("Batalha entre " + personagem1.nome + " e " + personagem2.nome);
        System.out.println(personagem1.nome + " - Poder Total: " + String.format("%.2f", poderTotalPersonagem1));
        System.out.println(personagem2.nome + " - Poder Total: " + String.format("%.2f", poderTotalPersonagem2));

        // Estrutura de Decisão descidindo quem é o mais forte ou definindo o empate
        if (poderTotalPersonagem1 > poderTotalPersonagem2) {
            System.out.println(personagem1.nome + " venceu a batalha!\n");
        } else if (poderTotalPersonagem1 < poderTotalPersonagem2) {
            System.out.println(personagem2.nome + " venceu a batalha!\n");
        } else {
            System.out.println("A batalha terminou em empate!\n");
        }
    }

    // Ordena membros por nivel
    public void ordenarMembrosPorNivel() {
        Collections.sort(membros);
        System.out.println("Membros do grupo " + nomeGrupo + " ordenados por nível:\n");
        for (Personagem membro : membros) {
            System.out.println("Nome Personagem: " + membro.nome + " Nível: " + membro.nivel);
        }
    }

    // Lista os Personagens
    public List<Personagem> getMembros() {
        return membros;
    }

}
