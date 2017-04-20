package br.com.fiap.casting;

public class Produto{
  private  int codigo,preco;

// Setters
  public void setCodigo(int codigo){
   this.codigo = codigo;
  }
  public void setPreco(int preco){
   this.preco = preco;
  }
// Getters
  public int getCodigo(){
    return codigo;
  }
  public int getPreco(){
    return preco;
  }
}