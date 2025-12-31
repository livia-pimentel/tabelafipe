package br.com.alura.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {
    // Cabeçalho generico para converter classe
    <T> T obterDados(String json, Class<T> classe);

    // Metodo para devolver uma lista
    <T> List<T> obterLista(String json, Class<T> classe);
}
