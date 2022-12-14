public class App {
    public static void main(String[] args){

        Funcionario jaozim = new Funcionario("Jaozim", "12345678910", 12450.67);
        Funcionario caião = new Funcionario("Caião", "10987654321", 10786.98);
        Funcionario kevin = new Funcionario("Kevin Space", "29292929291", 20987.65);
        Funcionario xueps = new Funcionario("Matheus Xueps", "69696969690", 10876.45);
        Funcionario viniGol = new Funcionario("Vini Malvadeza", "24242424247", 12908.00);
        Funcionario aufonsus = new Funcionario("Salvador Dali", "66666666666", 12134.65);

        Departamento topcão = new Departamento("Topcão");
        Departamento frontEnd = new Departamento("Front-end");
        Departamento backend = new Departamento("Back-end");

        topcão.addFuncionario(caião);
        topcão.addFuncionario(aufonsus);
        frontEnd.addFuncionario(xueps);
        frontEnd.addFuncionario(viniGol);
        backend.addFuncionario(kevin);
        backend.addFuncionario(jaozim);

        Empresa brabezaOrganization = new Empresa("Brabeza Organization - LTDA");

        brabezaOrganization.addDepartamento(topcão);
        brabezaOrganization.addDepartamento(frontEnd);
        brabezaOrganization.addDepartamento(backend);

        System.out.print("======DEPARTAMENTOS======\n\n");
        int i = 0;
        for(Departamento d: brabezaOrganization.getDepartamentos()){
            System.out.printf("%d -> %s\n",i, d.getNome());
            i++;
        }
        System.out.print("\nMÉDIA SALARIAL DA EMPRESA\n");
        System.out.printf("R$%.2f\n\n", brabezaOrganization.mediaSalarialEmpresa());


        System.out.printf("####Dados do departamento %s####\n\n", topcão.getNome());
        System.out.print("FUNCIONÁRIOS\n");
        for(Funcionario f: topcão.getFuncionarios()){
            System.out.printf("-> %s || salário -> R$%.2f\n", f.getNome(), f.getSalario());
        }
        System.out.print("\nMÉDIA SALARIAL DO DEPARTAMENTO\n");
        System.out.printf("R$%.2f\n\n", topcão.mediaSalarialDepartamento());


        System.out.printf("####Dados do departamento %s####\n\n", frontEnd.getNome());
        System.out.print("FUNCIONÁRIOS\n");
        for(Funcionario f: frontEnd.getFuncionarios()){
            System.out.printf("-> %s || salário -> R$%.2f\n", f.getNome(), f.getSalario());
        }
        System.out.print("\nMÉDIA SALARIAL DO DEPARTAMENTO\n");
        System.out.printf("R$%.2f\n\n", frontEnd.mediaSalarialDepartamento());


        System.out.printf("####Dados do departamento %s####\n\n", backend.getNome());
        System.out.print("FUNCIONÁRIOS\n");
        for(Funcionario f: backend.getFuncionarios()){
            System.out.printf("-> %s || salário -> R$%.2f\n", f.getNome(), f.getSalario());
        }
        System.out.print("\nMÉDIA SALARIAL DO DEPARTAMENTO\n");
        System.out.printf("R$%.2f\n\n", backend.mediaSalarialDepartamento());
    }
}
