public class Turma {
    private String curso, disciplina;

    public String getCurso(){
        return curso;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public void setCurso(String cursooo){
        curso = cursooo;
    }
    public void setDisciplina(String disciplinaaa){
        disciplina = disciplinaaa;
    }

    public void exibeDados(){
        System.out.println("Curso: " + curso + "\nDisciplina: " + disciplina);
    }
}
