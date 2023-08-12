class Materia {
    String materia;

    public Materia(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + materia);
    }
}