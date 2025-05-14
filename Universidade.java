import java.util.List;
import java.util.ArrayList;

public class Universidade {
private String nome;
private List<Departamento> departamentos = new ArrayList<>(); 
//GETTERS
public String getNome() {
        return this.nome;
    }
    
    public List<Departamento> getDepartamentos() {
        // Retorna uma cópia defensiva
        return new ArrayList<>(this.departamentos);
    }
//SETTERS
// ========== SETTERS ==========
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        if (departamentos == null) {
            throw new IllegalArgumentException("Lista de departamentos não pode ser nula");
        }
        this.departamentos = new ArrayList<>(departamentos);
    }
    public void adicionarDepartamento(Departamento departamento) {
        if (departamento == null) {
            throw new IllegalArgumentException("Departamento não pode ser nulo");
        }
        this.departamentos.add(departamento);
    }
    public void removerDepartamento(Departamento departamento) {
        if (departamento == null) {
            throw new IllegalArgumentException("Departamento não pode ser nulo");
        }
        this.departamentos.remove(departamento);
    }
    public void mostrarDetalhes() {
        System.out.println("Universidade: " + getNome());
        System.out.println("Departamentos:");
        for (Departamento departamento : departamentos) {
            System.out.println("- " + departamento.getNome());
        }
    }
    
    


}
