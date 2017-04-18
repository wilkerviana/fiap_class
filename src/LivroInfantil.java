package br.com.fiap.casting;

import br.com.fiap.casting.Livro;

public class LivroInfantil extends Livro{
  private String ilustrador;

  public void setIlustrador(String ilustrador){
    this.ilustrador = ilustrador;
  }

  public String getIlustrador(){
    return ilustrador;
  }
}