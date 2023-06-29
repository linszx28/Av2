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
public class Diretor extends CargoConfianca implements Contratacao{
    private double PREMIO = 0.3;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalarioFinal(){
        double salarioFinal = 0;
        salarioFinal += super.bonificacao.getValor() * super.salario;
        salarioFinal += super.salario * this.PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
    @Override
    public String toString() {
        return "\nDiretor:" + super.toString() + 
                "\nPREMIO:" + PREMIO;
    }
    
    
}
