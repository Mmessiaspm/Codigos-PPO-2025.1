public class CursoMain {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setNome("Messias");
        Curso curso = new Curso();
        curso.setNome("Informática");
        curso.setProfessor(prof);
        curso.mostrarDetalhes();
    }

    
}
