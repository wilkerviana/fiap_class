package br.com.fiap.casting;

import br.com.fiap.casting.Livro;

public class LivroInfantil extends Livro{
  private String ilustrador;
// Setters
  public void setIlustrador(String ilustrador){
    this.ilustrador = ilustrador;
  }
// Getters
  public String getIlustrador(){
    return ilustrador;
  }
}