package br.com.cadUser;

import java.util.ArrayList;

public class Pessoa {
    // Atributo nome privado
    private String nome;

    // Atributo ArrayList privado para armazenar nomes
    private ArrayList<String> nomesDigitados;

    // Construtor
    public Pessoa() {
        nomesDigitados = new ArrayList<>();
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o ArrayList de nomes digitados
    public ArrayList<String> getNomesDigitados() {
        return nomesDigitados;
    }

    // Método para adicionar um nome à lista de nomes digitados
    public void adicionarNomeDigitado(String nome) {
        nomesDigitados.add(nome);
    }

    // Método para limpar a lista de nomes digitados
    public void limparNomesDigitados() {
        nomesDigitados.clear();
    }
}
