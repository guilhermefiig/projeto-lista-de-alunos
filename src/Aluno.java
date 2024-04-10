import Disciplinas.Materia;

public class Aluno {
    private String nome;
    private int  rgm;
    private Materia materias;

    public Aluno(String nome, int rgm) {
        this.nome = nome;
        this.rgm = rgm;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", rgm=" + rgm +
                ", materias=" + materias +
                '}';
    }
}
