# POO em Java

Atividade de revisão de Programação Orientada a Objetos: um pequeno modelo de funcionários de uma empresa, com cálculo de bônus por cargo.

## Conceitos praticados

| Conceito | Onde aparece |
|---|---|
| Classe abstrata | `Pessoa`, com o método abstrato `exibirInfo()` |
| Interface | `Bonificacao`, com o método `calcularBonus()` |
| Herança | `Funcionario` estende `Pessoa`; `Gerente` e `Estagiario` estendem `Funcionario` |
| Polimorfismo | `Empresa` percorre uma `List<Funcionario>` e cada objeto calcula o próprio bônus |
| Encapsulamento | Atributos `protected` e `private` com getters e setters |

## Regras de bônus

| Cargo | Bônus |
|---|---|
| Funcionário | 10% do salário |
| Gerente | 10% do salário + bônus extra |
| Estagiário | R$ 300 fixos |

## Como executar

Requer JDK 9 ou superior. Na raiz do repositório:

```bash
javac -encoding UTF-8 -d out ArquiteturaSoftware/src/module-info.java ArquiteturaSoftware/src/pacote/*.java
java --module-path out -m ArquiteturaSoftware/pacote.Empresa
```

## Saída esperada

```text
Nome: Carlos, Salário: R$ 3000.0
Bônus: R$ 300.0
----------------------
Nome: Mariana, Salário: R$ 7000.0
Bônus: R$ 2700.0
----------------------
Nome: Lucas, Salário: R$ 1500.0
Bônus: R$ 300.0
----------------------
```
