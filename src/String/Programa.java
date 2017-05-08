package br.com.fiap.string;


class Funcionario{
    String nome , departamento, entradaBanco, rg;
    double salario;

    void recebeAumento(double valorAumento){
        this.salario += valorAumento;
    }

    double calcularGanhoAnual(){
        return this.salario *= 12;
    }
}

public class Programa{
    public static void main(String[] args){
        Funcionario joao = new Funcionario();
        joao.nome = "João Abelão";
        joao.departamento = "Gerencia";
        joao.entradaBanco = "01/01/2000";
        joao.rg = "12345689-7";
        joao.salario = 3100;

        joao.recebeAumento(300);

        System.out.println(joao.salario);
        System.out.println(joao.calcularGanhoAnual());
    }
}