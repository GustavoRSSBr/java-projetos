package com.ada.pooii.ordenacao;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }

    // Fazer a classe Pessoa ser ordenada pelos nomes das pessoas
    @Override
    public int compareTo(Pessoa pessoa) {
    	
        return this.nome.toLowerCase().compareTo(pessoa.nome.toLowerCase());
    }
}
