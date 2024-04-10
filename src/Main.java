import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos adicionar na lista?");
        int tamanho = input.nextInt();

        Aluno[] listaAlunos = new Aluno[tamanho];

        if (tamanho > 60 || tamanho < 0) {
            System.out.println("Tamanho inválido!");
            System.exit(0);
        }

        for (int i = 0; i < listaAlunos.length; i++){

            System.out.println("Digite o nome: ");
            String nome = input.next();

            System.out.println("Digite o rgm: ");
            int rgm = input.nextInt();

            listaAlunos[i] = new Aluno(nome, rgm);
        }

        System.out.println("Digite um rgm para buscar o aluno na lista: ");
        int buscarRgm = input.nextInt();

        for (int i = 0; i < listaAlunos.length; i++){
            if (buscarRgm == listaAlunos[i].getRgm()){
                System.out.println("Nome: " + listaAlunos[i].getNome());
                System.out.println("RGM: " + listaAlunos[i].getRgm());
            }
        }

        input.close();


//        ListaAlunos lista = new ListaAlunos();
//
//
//        lista.adicionarAluno(123,"jose");
//        lista.adicionarAluno(1234,"gui");
//        lista.adicionarAluno(525, "Igor");
//        lista.adicionarAluno(525555, "Matheus");
//
//
//        System.out.println(lista);
//
//        lista.removerAluno(123);
//
//        System.out.println(lista);
//
//        sc.close();

    }
}