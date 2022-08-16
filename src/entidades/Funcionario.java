package entidades;

public class Funcionario {
    private String nome;
    private Double salario;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Integer numDependentes;
    private INSS inss;

    public Funcionario(){}

    public Funcionario(String nome, Double salario, Integer horasTrabalhadas, Double valorHora, Integer numDependentes, INSS inss) {
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.numDependentes = numDependentes;
        this.inss = inss;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(Integer numDependentes) {
        this.numDependentes = numDependentes;
    }

    public INSS getInss() {
        return inss;
    }

    public void setInss(INSS inss) {
        this.inss = inss;
    }
}
