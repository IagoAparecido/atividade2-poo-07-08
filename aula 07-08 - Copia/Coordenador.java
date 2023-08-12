class Coordenador extends Pessoa {

    public Coordenador(String nome, int idade, String turma, String nota) {
        super(nome, idade, nota, turma);
    }

    public void Acao() {
        System.out.println(getNome() + " é o Coordenador.");
    }
}