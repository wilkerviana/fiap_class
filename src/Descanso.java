package br.com.fiap.casting;

import java.util.Scanner;

public class Descanso{
  public static void main (String[] args){
    System.out.println("Qual tabuada deseja visualizar?");
    Scanner teclado = new Scanner(System.in);
    int tabuada = teclado.nextInt();
    
    for(int cont = 0;cont <= 10;cont++){
      int result = tabuada * cont;
      System.out.println(tabuada + " x " + cont + " = " + result);
    }
  }
}