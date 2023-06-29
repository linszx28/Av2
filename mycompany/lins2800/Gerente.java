/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lins2800;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoConfianca{

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }
     
    
    @Override
    public double getSalarioFinal(){
        double salarioFinal = 0;
        salarioFinal += super.salario * super.bonificacao.getValor();
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Gerente:" + super.toString();
    }
    
    
}
