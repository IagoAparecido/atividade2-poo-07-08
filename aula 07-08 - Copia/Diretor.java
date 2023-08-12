class Diretor extends Pessoa {

    public Diretor(String nome, int idade, String turma, String nota) {
        super(nome, idade, nota, turma);
    }

    public void Acao() {
        System.out.println(getNome() + " é o Diretor.");
    }
}