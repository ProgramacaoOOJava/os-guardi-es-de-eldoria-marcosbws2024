public class Main {
    public static void main(String[] args) {
    // Instanciando o Guerreiro e o Mago
    Guerreiro guerreiro = new Guerreiro("Arthus", "Guerreiro", 10, 100, 50.0, 20.0);
    Mago mago = new Mago("Elenara", "Mago", 12, 80, 60.0, 30.0);
    // Exibindo os status dos personagens
    guerreiro.exibirStatus();
    mago.exibirStatus();
    System.out.println("************************Ataques dos Personagens:*******************");
    guerreiro.usarHabilidadeEspecial();
    mago.usarHabilidadeEspecial();
    // Criando o arrayList de Personagem para demonstrar o polimorfismo
    System.out.println("************************Demonstração de polimorfismo:*******************");
    List<Personagem> herois = new ArrayList<>();
    // adicionando os personagens ao arrayList
    herois.add(guerreiro);
    herois.add(mago);
    // Criando novos Personagens e adicionando ao arrayList
    herois.add(new Guerreiro("Leon", "Guerreiro", 8, 90, 45.0, 15.0));
    herois.add(new Mago("Merlin", "Mago", 15, 70, 70.0, 40.0));

    // Exibindo os status e habilidades especiais de todos os personagens no
    // arrayList
    for (Personagem heroi : herois) {
      heroi.exibirStatus();
      heroi.usarHabilidadeEspecial();
      System.out.println("---------------------------------------------------");
    }
    }
}
