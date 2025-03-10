package pacote;

public class Funcionario extends Pessoa implements Bonificacao {
    protected double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Salário: R$ " + salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}