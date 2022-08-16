package entidades;

import entidades.servicos.ServicoDoINSS;

import java.util.ArrayList;
import java.util.List;

public class INSS {
    private ServicoDoINSS servicoDoINSS;
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public INSS(){}

    public INSS(ServicoDoINSS servicoDoINSS){
        this.servicoDoINSS = servicoDoINSS;
    }

    public INSS(String nome, ServicoDoINSS servicoDoINSS) {
        this.servicoDoINSS = servicoDoINSS;
        this.nome = nome;
    }

    public ServicoDoINSS getServicoDoINSS() {
        return servicoDoINSS;
    }

    public void setServicoDoINSS(ServicoDoINSS servicoDoINSS) {
        this.servicoDoINSS = servicoDoINSS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getPensionistas() {
        return funcionarios;
    }

    public void addPensionista(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removePensionista(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public void imprimirHolerite(){
        System.out.println("Holerites: ");
        for(Funcionario f : funcionarios){
            System.out.println("Nome: "
                    + f.getNome()
                    + "\n"
                    + "Salario Liquido: R$ "
                    + String.format("%.2f", f.getSalario())
                    + " - "
                    + "Salario bruto: R$ "
                    + String.format("%.2f", servicoDoINSS.salarioBruto(f))
                    + " - IR: R$ "
                    + String.format("%.2f", servicoDoINSS.IR(f))
                    + " - INSS: R$ "
                    + String.format("%.2f",servicoDoINSS.INSS(f)));

        }
    }
}
