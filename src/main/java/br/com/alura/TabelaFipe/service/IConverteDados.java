package br.com.alura.TabelaFipe.service;

public interface IConverteDados {
    // Cabeçalho generico para converter classe
    <T> T obterDados(String json, Class<T> classe);
}
