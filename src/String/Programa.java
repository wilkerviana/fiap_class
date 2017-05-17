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

class Turma{
    Aluno[] alunos;
    void imprimeNotas(){
        for(int i=0;i < this.alunos.length; i++){
            Aluno aluno = this.alunos[i];
            System.out.println(aluno.notas);
        }
    }
}
class Aluno{
    String nome;
    int notas;
}
public class Programa{
    public static void main(String[] args){
        Funcionario joao = new Funcionario();
        joao.nome = "Joao";
        joao.departamento = "Gerencia";
        joao.entradaBanco = "01/01/2000";
        joao.rg = "12345689-7";
        joao.salario = 3100;

        joao.recebeAumento(300);

        System.out.println(joao.salario);
        System.out.println(joao.calcularGanhoAnual());

        Turma tina = new Turma();
        tina.alunos = new Aluno[2];

        tina.alunos[0] = new Aluno();
        tina.alunos[0].nome = "Joca";
        tina.alunos[0].notas = 9;

        tina.alunos[1] = new Aluno();
        tina.alunos[1].nome = "Maria";
        tina.alunos[1].notas = 7;

        tina.imprimeNotas();

    }
}