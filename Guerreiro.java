//Deasafio Aventureiro

//Classe Guerreiro que herda da classe Personagem
public class Guerreiro extends Personagem {
    private double forca;
//Construtor da classe Guerreiro
    public Guerreiro(String nome,
            String classe,
            int nivel,
            int pontosDeVida,
            double poderBase, double forca) {
//Chamando o construtor da superclasse Personagem
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }
//Implementação do método abstrato da superclasse Personagem
@Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + this.nome + " ataca com Espada Flamejante!");
    }

}
