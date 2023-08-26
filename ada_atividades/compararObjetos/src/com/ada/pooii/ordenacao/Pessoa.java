package com.ada.pooii.ordenacao;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;

    private LocalDate dataDeNascimento;
    

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        
    }
    
    public int getIdade() {
    	return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", idade=" + getIdade() + "Anos" +
                '}';
    }

    // Fazer a classe Pessoa ser ordenada pelos nomes das pessoas
    @Override
    public int compareTo(Pessoa pessoa) {
    	Integer idade = getIdade();
    	
        //return this.nome.toLowerCase().compareTo(pessoa.nome.toLowerCase());
        return idade.compareTo(pessoa.getIdade());
    }
}
