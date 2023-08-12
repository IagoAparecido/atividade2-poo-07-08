class Professor extends Pessoa {

    public Professor(String nome, int idade, String turma, String nota) {
        super(nome, idade, nota, turma);
    }

    public void Acao() {
        System.out.println(getNome() + " é o Professor.");
    }
}