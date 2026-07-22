import java.util.ArrayList;
import java.util.List;
//Desafio Mestre
public class Main {
    public static void main(String[] args) {
        Mago mago1 = new Mago("Gandalf", "Mago", 10, 100, 20, 15);
        Guerreiro guerreiro1 = new Guerreiro("Conan", "Guerreiro", 8, 120, 25, 18);
        Mago mago2 = new Mago("Morgana", "Mago", 15, 100, 20, 15);
        Guerreiro guerreiro2 = new Guerreiro("Arthus ", "Guerreiro", 20, 120, 25, 18);

        Grupo GrupoA = new Grupo("Grupo A");
        GrupoA.adicionarMembro(mago1);
        GrupoA.adicionarMembro(guerreiro1);

        Grupo GrupoB = new Grupo("Grupo B");
        GrupoB.adicionarMembro(mago2);
        GrupoB.adicionarMembro(guerreiro2);

        System.out.println("=== Listando membros dos grupos ===\n");
        GrupoA.listarMembros();
        GrupoB.listarMembros();

        System.out.println("\n=== Ordenando membros do Grupo A por nível ===\n");
        GrupoA.ordenarMembrosPorNivel();
        System.out.println("\n=== Ordenando membros do Grupo B por nível ===\n");
        GrupoB.ordenarMembrosPorNivel();

        System.out.println("=== Batalha entre membros do Grupo A e Grupo B ===\n");
        GrupoA.batalhar(mago1, guerreiro2);
        GrupoB.batalhar(guerreiro1, mago2);

        //batalhado entre membros do mesmo grupo
        System.out.println("\n=== Batalha entre membros do mesmo grupo ===\n");
        GrupoA.batalhar(GrupoA.getMembros().get(0), GrupoA.getMembros().get(1));
    //main
    }
}
