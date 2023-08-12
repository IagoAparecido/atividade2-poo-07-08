class Semestre {
  Aluno aluno;
  Professor professor;
  Materia materia;
  Diretor diretor;
  Coordenador coordenador;

  public Semestre(Aluno aluno, Professor professor, Materia materia, Coordenador coordenador,
      Diretor diretor) {
    this.aluno = aluno;
    this.professor = professor;
    this.materia = materia;
    this.diretor = diretor;
    this.coordenador = coordenador;
  }

  public void getInformacoes() {

    System.out.println("Informações do Semestre:");
    System.out.println(
        "ALuno: " + aluno.getNome() + ", Materia: " + materia.getMateria() + ", Professor: " + professor.getNome() +
            ", Coordenador: " + coordenador.getNome() + ", Diretor: " + diretor.getNome());

  }
}
