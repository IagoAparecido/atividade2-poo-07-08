abstract class Pessoa {
    String nome;
    String turma;
    String nota;
    int idade;

    public Pessoa(String nome, int idade, String turma, String nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNota() {
        return nota;
    }

    public String getTurma() {
        return turma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void Acao();
}

// public class Pessoa extends SQLClass {
// @Key

// String nome;
// String idade;
// String funcao;

// Pessoa() {
// this.setTableName("PESSOA");
// }

// public void printCliente() {
// System.out.println(

// this.nome + ", " +
// this.idade);
// }
// }
