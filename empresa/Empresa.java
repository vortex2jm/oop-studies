import java.util.LinkedList;
import java.util.List;

public class Empresa {
    
    public Empresa(String nome){
        this.nome = nome;
    }

    private String nome;
    private List<Departamento> departamentos = new LinkedList<Departamento>();


    // retorna a lista de departamentos
    public LinkedList<Departamento> getDepartamentos() {
        return new LinkedList<Departamento>(departamentos);
    }

    // adiciona um departamento na lista
    public boolean addDepartamento(Departamento departamento){
        return this.departamentos.add(departamento);
    }

    // remove um departamento da lista
    public boolean removeDepartamento(Departamento departamento){
        return this.departamentos.remove(departamento);
    }

    // verifica se esse departamento existe na empresa
    public boolean existsDepartamento(Departamento departamento){
        return this.departamentos.contains(departamento);
    }

    // verifica se a lista de departamentos está vazia
    public boolean isEmpty(){
        return this.departamentos.isEmpty();
    }

    public double mediaSalarialEmpresa(){
        double media=0;
        for(Departamento d: departamentos){
            media+=d.mediaSalarialDepartamento();
        }
        return media;
    }

    // retorna o nome da empresa
    public String getNome() {
        return nome;
    }
}
