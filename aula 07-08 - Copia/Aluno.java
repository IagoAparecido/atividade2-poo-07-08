class Aluno extends Pessoa {

    public Aluno(String nome, int idade, String nota, String turma) {
        super(nome, idade, nota, turma);
    }

    public void Acao() {
        System.out.println(getNome() + " é Aluno.");
    }
}