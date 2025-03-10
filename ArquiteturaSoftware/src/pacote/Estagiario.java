package pacote;


public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return 300.0;
    }
}
