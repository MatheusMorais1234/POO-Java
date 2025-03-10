package pacote;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario func1 = new Funcionario("Carlos", 3000);
        Gerente gerente1 = new Gerente("Mariana", 7000, 2000);
        Estagiario estagiario1 = new Estagiario("Lucas", 1500);

        funcionarios.add(func1);
        funcionarios.add(gerente1);
        funcionarios.add(estagiario1);

        for (Funcionario f : funcionarios) {
            f.exibirInfo();
            System.out.println("Bônus: R$ " + f.calcularBonus());
            System.out.println("----------------------");
        }
    }
}

