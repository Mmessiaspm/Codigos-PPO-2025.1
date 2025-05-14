public class Curso {
    private String nome;
    private Professor professor;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }   
    public Professor getProfessor() {
        return this.professor;
    }

    public void mostrarDetalhes() {
        System.out.println("Curso: " + getNome());
        System.out.println("Professor: " + professor.getNome());
    }

}
