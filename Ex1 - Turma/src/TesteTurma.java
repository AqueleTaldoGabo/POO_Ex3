public class TesteTurma {
    public static void main(String[] args){
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        turma1.setCurso("Ciencias da Computacao");
        turma2.setCurso("Matematica Aplicada");
        turma1.setDisciplina("POO");
        turma2.setDisciplina("Calculo-I");

        System.out.println("T1-Curso: " + turma1.getCurso() + "\nT1-Disciplina: " + turma1.getDisciplina());
        System.out.println("T2-Curso: " + turma2.getCurso() + "\nT2-Disciplina: " + turma2.getDisciplina());

        turma1.exibeDados();
        turma2.exibeDados();
    }
}
