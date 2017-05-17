package br.com.fiap.exercicios;

public class Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    public String getPlaca(){
        return placa;
    }
    public void setPlaca (String placa){
        this.placa = placa;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno (int ano){
        if(ano >= 1900 && ano < 2017){
            this.ano = ano;
        }else{
            this.ano = 1000;
        }
    }

    public Veiculo(){

    }
    public Veiculo(String placa, String marca, String modelo, int ano){
        this();
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}