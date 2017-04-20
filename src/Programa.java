package br.com.fiap.casting;

import br.com.fiap.casting.Produto;
import br.com.fiap.casting.Livro;

public class Programa{
  public static void main (String[] args){
    Livro hobbit = new Livro();

    hobbit.setAutor("J.R.R Tolkien");
    hobbit.setTitulo("O Hobbit");

    System.out.println(hobbit.getAutor() + " " + hobbit.getTitulo());

  }
}