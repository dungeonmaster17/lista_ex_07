package entidades.servicos;

import entidades.Funcionario;

public class ServicoDeCalculadora implements ServicoDoINSS{
    private static final double TAXA_DEPENDENTES = 50;
    @Override
    public double salarioBruto(Funcionario funcionario) {
        return funcionario.getHorasTrabalhadas() * funcionario.getValorHora() + TAXA_DEPENDENTES * funcionario.getNumDependentes();
    }

    @Override
    public double INSS(Funcionario funcionario) {
        if(funcionario.getSalario() <= 1000){
            return funcionario.getSalario() * 0.085;
        }
        return 0.09;
    }

    @Override
    public double IR(Funcionario funcionario) {
        if(funcionario.getSalario() <= 500){
            return 0;
        } else if (funcionario.getSalario() > 500 && funcionario.getSalario() < 1000){
            return 0.05;
        }
        return funcionario.getSalario() * 0.07;
    }
}
