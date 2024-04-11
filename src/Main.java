import Disciplinas.ListaMaterias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos adicionar na lista? ");
        int tamanho = input.nextInt();

        Aluno[] vetorAlunos = new Aluno[tamanho];

        if (tamanho > 60 || tamanho < 0) {
            System.out.println("Tamanho inválido!");
            System.exit(0);
        }

        for (int i = 0; i < vetorAlunos.length; i++){
            ListaMaterias listaMaterias = new ListaMaterias();

            System.out.printf("  Digite o nome do aluno[%d]: ", i+1);
            String nome = input.next();

            System.out.printf("  Digite o rgm do aluno[%d]: ", i+1);
            int rgm = input.nextInt();

            input.nextLine();

            while (true){
                System.out.printf("    Digite uma matéria: ");
                String materia = input.nextLine();
                listaMaterias.addMateria(materia);

                System.out.print("    Quer adicionar mais matérias [sim/não]? ");
                String resposta = input.nextLine().toLowerCase();

                if (resposta.equals("não")) {
                    break;
                }
            }

            vetorAlunos[i] = new Aluno(nome, rgm, listaMaterias);
        }

        System.out.println("\nLista com todos os alunos e seu dados: ");
        for (int i = 0; i < vetorAlunos.length; i++){
            System.out.println(" Nome: " + vetorAlunos[i].getNome());
            System.out.println(" RGM: " + vetorAlunos[i].getRgm());
            System.out.println(" Matéria/as: " + vetorAlunos[i].getListaMaterias());
        }

        System.out.print("\nDigite um rgm para buscar o aluno na lista: ");
        int buscarRgm = input.nextInt();

        boolean alunoEncontrado = false;
        for (int i = 0; i < vetorAlunos.length; i++) {
            if (buscarRgm == vetorAlunos[i].getRgm()) {
                System.out.println(" Nome: " + vetorAlunos[i].getNome());
                System.out.println(" RGM: " + vetorAlunos[i].getRgm());
                System.out.println(" Matéria/as: " + vetorAlunos[i].getListaMaterias());
                alunoEncontrado = true;
                break;
            }
        }
        if (!alunoEncontrado) {
            System.out.println("Aluno não encontrado! ");
        }

        input.close();
    }
}
