package entidades.servicos;

import entidades.Funcionario;

public interface ServicoDoINSS {
    double salarioBruto(Funcionario funcionario);
    double INSS(Funcionario funcionario);
    double IR(Funcionario funcionario);
}
