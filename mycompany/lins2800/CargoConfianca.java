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
public abstract class CargoConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoConfianca(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    
    
}
