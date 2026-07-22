//Desafio Mestre

//classe Mago que herda da classe Personagem
public class Mago extends Personagem {
    private double inteligencia;

    // Construtor da classe Mago
    public Mago(String nome,
            String classe,
            int nivel,
            int pontosDeVida,
            double poderBase,
            double inteligencia) {
        // Chamando o construtor da superclasse Personagem
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }

    // Implementação do método abstrato da superclasse Personagem
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("O mago " + this.nome + " usa sua habilidade especial: Bola de Fogo!");
    }

    //Sobrescrevendo metodo da Classe Personagem para Calcular o Poder
    @Override
    public double calcularPoderTotal() {
        return (this.poderBase * this.nivel);
    }
}
