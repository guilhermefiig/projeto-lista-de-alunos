import java.util.Arrays;

public class ListaAlunos {
    public Aluno[] listaAlunos = new Aluno[60];


    public void adicionarAluno(int rgm, String nome) {
        Aluno novoAluno = new Aluno(nome, rgm);
        for (int i = 0; i < listaAlunos.length; i++) {
            if (listaAlunos[i] == null) {
                listaAlunos[i] = novoAluno;
                break;
            }
        }
    }


    public void removerAluno(int rgm) {
        for (int i = 0; i < listaAlunos.length; i++) {
            if (listaAlunos[i] != null && listaAlunos[i].getRgm() == rgm) {
                listaAlunos[i] = null;

                for (int j = i; j < listaAlunos.length - 1; j++) {
                    listaAlunos[j] = listaAlunos[j + 1];
                }

                listaAlunos[listaAlunos.length - 1] = null;
                break;
            }
        }
    }

//    public String buscarAluno(Aluno[] listaAlunos, int rgm) {
//        for (int i = 0; i < listaAlunos.length; i++) {
//            if (listaAlunos[i] != null && rgm == listaAlunos[i].getRgm()) {
//                return "Nome: " + listaAlunos[i].getNome() + "\nRgm: "+ listaAlunos[i].getRgm();
//            }
//        }
//        return null;
//    }

    public Aluno getAluno(int rgm){
        return null;
    }

    @Override
    public String toString() {
        return "ListaAlunos{" +
                "listaAlunos=" + Arrays.toString(listaAlunos) +
                '}';
    }
}
