package br.com.fiap.casting;

import br.com.fiap.casting.Produto;

public class Livro extends Produto{
  private String autor;
  private String titulo;
  private String isbn;

  public void setAutor(String autor){
    this.autor = autor;
  }
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  public void setIsbn(String isbn){
    this.isbn = isbn;
  }

  public String getAutor(){
    return autor;
  }
  public String getTitulo(){
    return titulo;
  }
  public String getIsbn(){
    return isbn;
  }
}