//Desafio Aventureiro

//Classe Abstrata Personagem, que será a superclasse para as classes Guerreiro e Mago
public abstract class Personagem {
//variáveis de instância
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

//CONSTRUTOR DA CLASSE PERSONAGEM
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    //Metodo para Exibir as informações
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }
    
    //método abstrato que será implementado nas subclasses
    public abstract void usarHabilidadeEspecial(); 
}
