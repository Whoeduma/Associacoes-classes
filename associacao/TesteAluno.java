
package associacao;


public class TesteAluno {

    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");

        Disciplina disciplina1 = new Disciplina("Matematica");
        Disciplina disciplina2 = new Disciplina("Portugues");

        aluno1.adicionarDisciplina(disciplina1);
        aluno1.adicionarDisciplina(disciplina2);
        aluno2.adicionarDisciplina(disciplina2);

        disciplina1.adicionarAluno(aluno1);
        disciplina2.adicionarAluno(aluno1);
        disciplina2.adicionarAluno(aluno2);

        System.out.println("Disciplinas do aluno " + aluno1.getNome() + ":");
        for (Disciplina disciplina : aluno1.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }

        System.out.println("\nAlunos na disciplina " + disciplina2.getNome() + ":");
        for (Aluno aluno : disciplina2.getAlunos()) {
            System.out.println(aluno.getNome());
        }
    }
    
}
