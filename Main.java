public class Main {
    public static void main(String[] args) {
        //instanciando os objetos da classe Personagem
        Personagem heroi1 = new Personagem("Aragorn", "Guerreiro", 10, 100, 50.0);
        Personagem heroi2= new  Personagem("Gandalf", "Mago", 20, 80, 100.0);

        //chamando o metodo exibirStatus() para exibir as informações dos personagens
        heroi1.exibirStatus();
        System.out.println();
        heroi2.exibirStatus();
    }
}
