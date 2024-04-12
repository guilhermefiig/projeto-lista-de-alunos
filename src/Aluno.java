import ListaEncadeada.ListaMaterias;

public class Aluno {
    private String nome;
    private int  rgm;
    private ListaMaterias materias;

    public Aluno(int rgm, String nome) {
        this.rgm = rgm;
        this.nome = nome;
        this.materias = new ListaMaterias();
    }

    public void addMateria(String name){
        materias.addMateria(name);
    }

    public void removeMateria(String name){
        materias.removerMateria(name);
    }

    public int getRgm() {
        return rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaMaterias getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "\n  Nome do Aluno: " + nome + "\n  RGM: " + rgm + "\n  Matérias: " + materias ;
    }
}