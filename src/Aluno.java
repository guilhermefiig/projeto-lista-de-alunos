import Disciplinas.ListaMaterias;
import Disciplinas.Materia;

public class Aluno {
    private String nome;
    private int  rgm;
    private ListaMaterias listaMaterias;

    public Aluno(String nome, int rgm, ListaMaterias listaMaterias) {
        this.nome = nome;
        this.rgm = rgm;
        this.listaMaterias = listaMaterias;
    }

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

    public ListaMaterias getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ListaMaterias listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", rgm=" + rgm +
                ", materias=" + listaMaterias +
                '}';
    }
}
