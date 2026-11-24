package com.example.tabelafipe.principal;

import com.example.tabelafipe.service.ConsumirAPI;
import com.example.tabelafipe.service.ConverterDados;

import java.util.Scanner;

public class Principal {
    private Scanner ler = new Scanner(System.in);
    private final String Entrada = "https://fipe.parallelum.com.br/api/v2/";
    private ConsumirAPI consumo = new ConsumirAPI();
    private ConverterDados converter = new ConverterDados();

  public void exibirMenu(){
      var menu = """
            *** OPÇÕES ***
            Carro
            Moto
            Caminhão
            
            Digite uma das opções para consulta:
            
            """;

      System.out.println(menu);
      var opcao = ler.nextLine();
      String endereco;

      if (opcao.toLowerCase().contains("carr")){
          endereco = Entrada + "cars/brands";
      } else if (opcao.toLowerCase().contains("mot")){
          endereco = Entrada + "motorcycles/brands";
      } else {
          endereco = Entrada + "trucks/brands";
      }

      var json = consumo.obterDados(endereco);
      IO.println(json);
  }
}

