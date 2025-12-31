package br.com.alura.TabelaFipe.principal;

import br.com.alura.TabelaFipe.model.Dados;
import br.com.alura.TabelaFipe.service.ConsumoApi;
import br.com.alura.TabelaFipe.service.ConverteDados;

import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    // Atributo
    private Scanner leitura = new Scanner(System.in);
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    private ConsumoApi requisicaoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    // Metodo para exibir o menu
    public void exibeMenu() {


        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar: 
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();

        String endereco;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "moto/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = requisicaoApi.obterDados(endereco);
        System.out.println(json);

        // Transformar em uma coleção
        var marcas = conversor.obterLista(json, Dados.class);
        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        // Informar o codigo da marca desejada, para obter os modelos
        System.out.println("Informe o código da marca para consulta: ");
        var codigoMarca = leitura.nextLine();



    }

}
