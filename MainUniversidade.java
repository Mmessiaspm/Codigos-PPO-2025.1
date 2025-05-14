public class MainUniversidade {
        public static void main(String[] args) {
        Universidade uf = new Universidade();
        uf.setNome("IFPI");
        
        Departamento dept1 = new Departamento();
        Departamento dept2 = new Departamento();
        dept1.setNome("Informática");
        dept2.setNome("Administração");
        
        uf.adicionarDepartamento(dept1);
        uf.adicionarDepartamento(dept2);
        uf.mostrarDetalhes();  

        
    }


}
