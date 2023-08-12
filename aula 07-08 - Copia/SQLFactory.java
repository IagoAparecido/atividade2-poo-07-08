public class SQLFactory {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Roberto", 20, "10", "ADS");
        Professor professor = new Professor("Maria", 28, "0", "ADS");
        Coordenador coordenador = new Coordenador("Rafael", 43, "0", "ADS");
        Diretor diretor = new Diretor("Will", 58, "0", "ADS");
        Materia materia1 = new Materia("P.O.O");

        // Updated constructor parameters based on your Semestre class definition
        Semestre semestre1 = new Semestre(aluno, professor, materia1, coordenador, diretor);
        semestre1.getInformacoes();

    }
}
