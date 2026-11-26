package com.example.tabelafipe.model;

public class Veiculo {
    private String marca;
    private String modelo;
    private Double valor;
    private String anoFabricacao;
    public Veiculo(String marca, String modelo, Double valor, String anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValor() {
        return valor;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public String toString() {
        return "Veículo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor=" + valor +
                ", ano de Fabricação='" + anoFabricacao + '\'' +
                '}';
    }
}
