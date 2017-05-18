package br.com.fiap.exercicios;

import br.com.fiap.exercicios.Veiculo;

public class Programa{
    public static void main(String[] args){
        
        // Veiculo uno = new Veiculo();
        // uno.setPlaca("XYZ1234");
        // uno.setMarca("Fiat");
        // uno.setModelo("Uno Way");

        String rm = JOptionPane.showInputDialog("Informe seu RM:");

        if(!rm.toLowerCase().startsWith("rm") || rm.length() != 7){
            System.out.println("Digita essa parada direito!");
        }else{
            int parteNumerica = Integer.parseInt(rm.substring(2));
            System.out.println("A parte do rm numerica rm e" + parteNumerica);
        }
    }
}